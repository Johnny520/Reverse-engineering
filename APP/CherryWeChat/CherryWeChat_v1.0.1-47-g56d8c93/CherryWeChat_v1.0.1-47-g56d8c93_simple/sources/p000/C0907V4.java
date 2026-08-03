package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: V4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0907V4 implements InterfaceC1189as {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2826a;

    /* JADX INFO: renamed from: b */
    public final Object f2827b;

    /* JADX INFO: renamed from: c */
    public final Object f2828c;

    public /* synthetic */ C0907V4(int r1, Object r2, Object r3) {
        this.f2826a = r1;
        this.f2828c = r2;
        this.f2827b = r3;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final boolean mo994a(Object r3) {
        switch(this.f2826a) {
            case 0: goto L23;
            case 1: goto L22;
            case 2: goto L14;
            case 3: goto L11;
            default: goto L4;
        };
    L4:
        Uri r32 = (Uri) r3;
        if ("android.resource".equals(r32.getScheme()) == true) goto L7;
    L9:
        return false;
    L7:
        if (((Context) this.f2828c).getPackageName().equals(r32.getAuthority()) == false) goto L9;
        return true;
    L11:
        Integer r33 = (Integer) r3;
        return true;
    L14:
        Iterator r0 = ((ArrayList) this.f2828c).iterator();
    L16:
        if (r0.hasNext() == false) goto L20;
        if (((InterfaceC1189as) r0.next()).mo994a(r3) == false) goto L16;
        return true;
    L20:
        return false;
    L22:
        Integer r34 = (Integer) r3;
        return true;
    L23:
        Uri r35 = (Uri) r3;
        if ("file".equals(r35.getScheme()) == true) goto L26;
        return false;
    L26:
        if (r35.getPathSegments().isEmpty() == false) goto L28;
        return false;
    L28:
        if ("android_asset".equals(r35.getPathSegments().get(0)) == false) goto L38;
        return true;
    L38:
        return false;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object r9, int r10, int r11, C2644vt r12) {
        switch(this.f2826a) {
            case 0: goto L55;
            case 1: goto L49;
            case 2: goto L36;
            case 3: goto L28;
            default: goto L4;
        };
    L4:
        Uri r92 = (Uri) r9;
        InterfaceC1189as r0 = (InterfaceC1189as) this.f2827b;
        List<String> r1 = r92.getPathSegments();
        C1108Zr r6 = null;
        if (r1.size() != 1) goto L17;
        int r13 = Integer.parseInt(r92.getPathSegments().get(0));     // Catch: NumberFormatException -> L13
        if (r13 == 0) goto L9;
        r6 = r0.mo995b(Integer.valueOf(r13), r10, r11, r12);     // Catch: NumberFormatException -> L13
    L63:
        return r6;
    L9:
        if (Log.isLoggable("ResourceUriLoader", 5) == false) goto L63;
        r92.toString();     // Catch: NumberFormatException -> L13
    L14:
        if (Log.isLoggable("ResourceUriLoader", 5) == false) goto L71;
        Objects.toString(r92);
        return r6;
    L71:
        return r6;
    L17:
        if (r1.size() != 2) goto L25;
        List<String> r14 = r92.getPathSegments();
        String r2 = r14.get(0);
        String r15 = r14.get(1);
        Context r3 = (Context) this.f2828c;
        int r16 = r3.getResources().getIdentifier(r15, r2, r3.getPackageName());
        if (r16 != 0) goto L75;
        if (Log.isLoggable("ResourceUriLoader", 5) == false) goto L73;
        r92.toString();
        return null;
    L73:
        return null;
    L75:
        return r0.mo995b(Integer.valueOf(r16), r10, r11, r12);
    L25:
        if (Log.isLoggable("ResourceUriLoader", 5) == false) goto L76;
        r92.toString();
        return null;
    L76:
        return null;
    L28:
        Integer r93 = (Integer) r9;
        Uri r94 = Uri.parse("android.resource://" + ((Resources) this.f2827b).getResourcePackageName(r93.intValue()) + '/' + r93);     // Catch: Resources.NotFoundException -> L31
    L32:
        if (r94 != null) goto L35;
        return null;
    L35:
        return ((InterfaceC1189as) this.f2828c).mo995b(r94, r10, r11, r12);
    L31:
        r94 = null;
        goto L32
    L36:
        ArrayList r02 = (ArrayList) this.f2828c;
        int r17 = r02.size();
        ArrayList r22 = new ArrayList(r17);
        int r4 = 0;
        InterfaceC0802Sm r5 = null;
    L37:
        if (r4 >= r17) goto L45;
        InterfaceC1189as r62 = (InterfaceC1189as) r02.get(r4);
        if (r62.mo994a(r9) == false) goto L43;
        C1108Zr r63 = r62.mo995b(r9, r10, r11, r12);
        if (r63 == null) goto L43;
        r5 = r63.f3501a;
        r22.add(r63.f3503c);
    L43:
        r4 = r4 + 1;
        goto L37
    L45:
        if (r22.isEmpty() == true) goto L78;
        if (r5 != null) goto L48;
        return null;
    L48:
        return new C1108Zr(r5, new C2334os(r22, (InterfaceC1024Xt) this.f2827b));
    L78:
        return null;
    L49:
        Integer r95 = (Integer) r9;
        Resources.Theme r102 = (Resources.Theme) r12.m5177c(C2604uw.f8991b);
        if (r102 == null) goto L52;
        Resources r112 = r102.getResources();
    L54:
        return new C1108Zr(new C1382et(r95), new C0836Td(r102, r112, (C0793Sd) this.f2827b, r95.intValue()));
    L52:
        r112 = ((Context) this.f2828c).getResources();
        goto L54
    L55:
        Uri r96 = (Uri) r9;
        String r103 = r96.toString().substring(22);
        C1382et r122 = new C1382et(r96);
        AssetManager r97 = (AssetManager) this.f2828c;
        switch(((C0864U4) this.f2827b).f2732a) {
            case 0: goto L58;
            default: goto L57;
        };
    L57:
        C2237mh r03 = new C2237mh(r97, r103, 1);
    L60:
        return new C1108Zr(r122, r03);
    L58:
        r03 = new C2237mh(r97, r103, 0);
        goto L60
    }

    public String toString() {
        switch(this.f2826a) {
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f2828c).toArray()) + '}';
    }

    public C0907V4(Resources r2, InterfaceC1189as r3) {
        this.f2826a = 3;
        this.f2827b = r2;
        this.f2828c = r3;
    }

    public C0907V4(Context r2, C0793Sd r3) {
        this.f2826a = 1;
        this.f2828c = r2.getApplicationContext();
        this.f2827b = r3;
    }

    public C0907V4(Context r2, InterfaceC1189as r3) {
        this.f2826a = 4;
        this.f2828c = r2.getApplicationContext();
        this.f2827b = r3;
    }
}
