package p358y9;

import ga.C2602l;
import ga.EnumC2599k;
import java.util.List;
import java.util.Map;
import p172l8.AbstractC4717x;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p213oa.C5692c;

/* JADX INFO: renamed from: y9.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9653x {

    /* JADX INFO: renamed from: a */
    public static final List f32881a;

    /* JADX INFO: renamed from: b */
    public static final List f32882b;

    /* JADX INFO: renamed from: c */
    public static final Map f32883c;

    /* JADX INFO: renamed from: d */
    public static final Map f32884d;

    /* JADX INFO: renamed from: e */
    public static final Map f32885e;

    static {
        EnumC9613c enumC9613c = EnumC9613c.f32727t;
        EnumC9613c enumC9613c2 = EnumC9613c.f32725r;
        EnumC9613c enumC9613c3 = EnumC9613c.f32726s;
        List listM20803r = AbstractC5114x.m20803r(enumC9613c, enumC9613c2, enumC9613c3, EnumC9613c.f32729v, EnumC9613c.f32728u);
        f32881a = listM20803r;
        List listM20789e = AbstractC5112w.m20789e(enumC9613c3);
        f32882b = listM20789e;
        C5692c c5692cM37668k = AbstractC9628j0.m37668k();
        EnumC2599k enumC2599k = EnumC2599k.f6899s;
        Map mapM20771l = AbstractC5109u0.m20771l(AbstractC4717x.m18815a(c5692cM37668k, new C9652w(new C2602l(enumC2599k, false, 2, null), listM20803r, false)), AbstractC4717x.m18815a(AbstractC9628j0.m37666i(), new C9652w(new C2602l(enumC2599k, false, 2, null), listM20803r, false)), AbstractC4717x.m18815a(AbstractC9628j0.m37667j(), new C9652w(new C2602l(EnumC2599k.f6897q, false, 2, null), listM20803r, false, 4, null)));
        f32883c = mapM20771l;
        Map mapM20771l2 = AbstractC5109u0.m20771l(AbstractC4717x.m18815a(AbstractC9628j0.m37661d(), new C9652w(new C2602l(enumC2599k, false, 2, null), listM20789e, false, 4, null)), AbstractC4717x.m18815a(AbstractC9628j0.m37662e(), new C9652w(new C2602l(EnumC2599k.f6898r, false, 2, null), listM20789e, false, 4, null)));
        f32884d = mapM20771l2;
        f32885e = AbstractC5109u0.m20774o(mapM20771l, mapM20771l2);
    }

    /* JADX INFO: renamed from: a */
    public static final Map m37760a() {
        return f32885e;
    }

    /* JADX INFO: renamed from: b */
    public static final Map m37761b() {
        return f32883c;
    }
}
