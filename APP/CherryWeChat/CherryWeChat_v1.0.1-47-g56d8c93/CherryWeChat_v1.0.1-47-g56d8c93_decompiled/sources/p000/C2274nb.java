package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: nb */
/* JADX INFO: loaded from: classes.dex */
public final class C2274nb {

    /* JADX INFO: renamed from: j */
    public static final SparseIntArray f7999j;

    /* JADX INFO: renamed from: a */
    public int f8000a;

    /* JADX INFO: renamed from: b */
    public int f8001b;

    /* JADX INFO: renamed from: c */
    public int f8002c;

    /* JADX INFO: renamed from: d */
    public float f8003d;

    /* JADX INFO: renamed from: e */
    public float f8004e;

    /* JADX INFO: renamed from: f */
    public float f8005f;

    /* JADX INFO: renamed from: g */
    public int f8006g;

    /* JADX INFO: renamed from: h */
    public String f8007h;

    /* JADX INFO: renamed from: i */
    public int f8008i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f7999j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* JADX INFO: renamed from: a */
    public final void m4603a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0639Ou.f2040g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f7999j.get(index)) {
                case 1:
                    this.f8004e = typedArrayObtainStyledAttributes.getFloat(index, this.f8004e);
                    break;
                case 2:
                    this.f8002c = typedArrayObtainStyledAttributes.getInt(index, this.f8002c);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = AbstractC0585Nj.f1897b[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f8000a = C2411qb.m4850f(typedArrayObtainStyledAttributes, index, this.f8000a);
                    break;
                case 6:
                    this.f8001b = typedArrayObtainStyledAttributes.getInteger(index, this.f8001b);
                    break;
                case 7:
                    this.f8003d = typedArrayObtainStyledAttributes.getFloat(index, this.f8003d);
                    break;
                case LuaJitConsts.LUA_TTHREAD /* 8 */:
                    this.f8006g = typedArrayObtainStyledAttributes.getInteger(index, this.f8006g);
                    break;
                case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                    this.f8005f = typedArrayObtainStyledAttributes.getFloat(index, this.f8005f);
                    break;
                case 10:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.f8008i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f8007h = string;
                        if (string.indexOf("/") > 0) {
                            this.f8008i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        }
                    } else {
                        typedArrayObtainStyledAttributes.getInteger(index, this.f8008i);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
