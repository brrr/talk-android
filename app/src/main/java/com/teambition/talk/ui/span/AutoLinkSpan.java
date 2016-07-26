package com.teambition.talk.ui.span;

import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

import com.teambition.talk.ui.activity.WebContainerActivity;

/**
 * Created by zeatual on 15/2/27.
 */
public class AutoLinkSpan extends ClickableSpan {

    private final String mURL;
    private final int color;

    public AutoLinkSpan(String mURL, int color) {
        this.mURL = mURL;
        this.color = color;
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        ds.setColor(color);
        ds.setUnderlineText(false);
    }

    @Override
    public void onClick(View widget) {
        Intent intent = WebContainerActivity.newIntent(widget.getContext(), mURL, null);
        widget.getContext().startActivity(intent);
    }
}
