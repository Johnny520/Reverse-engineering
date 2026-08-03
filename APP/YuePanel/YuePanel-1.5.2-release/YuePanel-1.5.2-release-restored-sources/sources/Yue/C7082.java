package Yue;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: Yue.ۥۡۦۣۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,396:1\n1789#2,3:397\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:397,3\n*E\n"})
public final class C7082 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۦۣۤ$ۥ */
    @InterfaceC7507({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,396:1\n*E\n"})
    public static final class C1159<T> extends AbstractC5673 implements InterfaceC5124<T, Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int f21389;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1159(int i) {
            super(1);
            this.f21389 = i;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Enum */
        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Boolean invoke(Enum r3) {
            InterfaceC4865 interfaceC4865 = (InterfaceC4865) r3;
            return Boolean.valueOf((this.f21389 & interfaceC4865.getMask()) == interfaceC4865.getValue());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final InterfaceC5957 m22075(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new C5958(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ <T extends Enum<T> & InterfaceC4865> Set<T> m22076(int i) {
        C5499.m17112(4, C4750.f10502);
        EnumSet enumSetAllOf = EnumSet.allOf(Enum.class);
        C5499.m17102(enumSetAllOf, "fromInt$lambda$1");
        C5499.m17110();
        C3885.m10797(enumSetAllOf, new C1159(i));
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        C5499.m17102(setUnmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        return setUnmodifiableSet;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final InterfaceC5957 m22077(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new C5958(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final C5458 m22078(MatchResult matchResult) {
        return C7007.m21793(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final C5458 m22079(MatchResult matchResult, int i) {
        return C7007.m21793(matchResult.start(i), matchResult.end(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int m22080(Iterable<? extends InterfaceC4865> iterable) {
        Iterator<? extends InterfaceC4865> it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= it.next().getValue();
        }
        return value;
    }
}
