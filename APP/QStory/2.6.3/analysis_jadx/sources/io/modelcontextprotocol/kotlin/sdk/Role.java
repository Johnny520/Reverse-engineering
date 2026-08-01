package io.modelcontextprotocol.kotlin.sdk;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;
import p056.C6631;
import p056.C6789;
import p087.C7109;
import p089.InterfaceC7181;
import p089.InterfaceC7184;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/modelcontextprotocol/kotlin/sdk/Role;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Companion", "飘花落叶言世子楪兰苏哲/飘花落叶言楪哲兰苏世子", "user", "assistant", "kotlin-sdk"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Role {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ Role[] $VALUES;
    private static final InterfaceC5184 $cachedSerializer$delegate;
    public static final C6789 Companion;
    public static final Role user = new Role("user", 0);
    public static final Role assistant = new Role("assistant", 1);

    private static final /* synthetic */ Role[] $values() {
        return new Role[]{user, assistant};
    }

    static {
        Role[] roleArr$values = $values();
        $VALUES = roleArr$values;
        $ENTRIES = AbstractC4364.m8866(roleArr$values);
        Companion = new C6789();
        $cachedSerializer$delegate = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(23));
    }

    private Role(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7184 _init_$_anonymous_() {
        Role[] roleArrValues = values();
        roleArrValues.getClass();
        return new C7109("io.modelcontextprotocol.kotlin.sdk.Role", roleArrValues);
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static Role valueOf(String str) {
        return (Role) Enum.valueOf(Role.class, str);
    }

    public static Role[] values() {
        return (Role[]) $VALUES.clone();
    }
}
