package io.github.cherrywechat.p002ui;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import p000.AbstractC0295Gu;
import p000.AbstractC1073Yz;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialSwitch extends AbstractC1073Yz {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0295Gu.m625r(-801260508805173L);
        setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{R.attr.state_pressed}, new int[0]}, new int[]{-10132123, (int) getThumbColor(), (int) getThumbColor()}));
        setSingleLine(true);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    private final long getThumbColor() {
        Context context = getContext();
        AbstractC0295Gu.m625r(-782053415057461L);
        return AbstractC0295Gu.m628u(context) ? 4286348412L : 4291611852L;
    }
}
