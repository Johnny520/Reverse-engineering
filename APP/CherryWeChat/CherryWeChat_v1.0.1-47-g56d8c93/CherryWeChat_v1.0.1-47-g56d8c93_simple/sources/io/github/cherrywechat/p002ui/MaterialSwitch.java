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
    public MaterialSwitch(Context r3, AttributeSet r4) {
        AbstractC0295Gu.m625r(-801260508805173L);
        super(r3, r4);
        int[] r32 = {-10132123, (int) getThumbColor(), (int) getThumbColor()};
        setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{R.attr.state_pressed}, new int[0]}, r32));
        setSingleLine(true);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    private final long getThumbColor() {
        Context r0 = getContext();
        AbstractC0295Gu.m625r(-782053415057461L);
        if (AbstractC0295Gu.m628u(r0) == false) goto L6;
        return 4286348412L;
    L6:
        return 4291611852L;
    }
}
