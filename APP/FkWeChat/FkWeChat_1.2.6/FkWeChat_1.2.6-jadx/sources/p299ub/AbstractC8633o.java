package p299ub;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p080f9.AbstractC2368o;
import p080f9.C2363j;

/* JADX INFO: renamed from: ub.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8633o {
    /* JADX INFO: renamed from: e */
    public static final InterfaceC8626i m33228e(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new C8628j(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC8626i m33229f(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new C8628j(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final C2363j m33230g(MatchResult matchResult) {
        return AbstractC2368o.m8592s(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: renamed from: h */
    public static final C2363j m33231h(MatchResult matchResult, int i10) {
        return AbstractC2368o.m8592s(matchResult.start(i10), matchResult.end(i10));
    }
}
