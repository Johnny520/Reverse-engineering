package io.ktor.network.selector;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/network/selector/SelectInterest;", "", "", "flag", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "I", "getFlag", "()I", "Companion", "io/ktor/network/selector/飘花落叶言子楪苏世兰哲", "READ", "WRITE", "ACCEPT", "CONNECT", "ktor-network"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectInterest {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ SelectInterest[] $VALUES;
    private static final SelectInterest[] AllInterests;
    public static final C4004 Companion;
    private static final int[] flags;
    private static final int size;
    private final int flag;
    public static final SelectInterest READ = new SelectInterest("READ", 0, 1);
    public static final SelectInterest WRITE = new SelectInterest("WRITE", 1, 4);
    public static final SelectInterest ACCEPT = new SelectInterest("ACCEPT", 2, 16);
    public static final SelectInterest CONNECT = new SelectInterest("CONNECT", 3, 8);

    private static final /* synthetic */ SelectInterest[] $values() {
        return new SelectInterest[]{READ, WRITE, ACCEPT, CONNECT};
    }

    static {
        SelectInterest[] selectInterestArr$values = $values();
        $VALUES = selectInterestArr$values;
        $ENTRIES = AbstractC4364.m8866(selectInterestArr$values);
        Companion = new C4004();
        AllInterests = (SelectInterest[]) getEntries().toArray(new SelectInterest[0]);
        InterfaceC4365 entries = getEntries();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((SelectInterest) it.next()).flag));
        }
        flags = AbstractC4344.m8798(arrayList);
        size = getEntries().size();
    }

    private SelectInterest(String str, int i, int i2) {
        this.flag = i2;
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static SelectInterest valueOf(String str) {
        return (SelectInterest) Enum.valueOf(SelectInterest.class, str);
    }

    public static SelectInterest[] values() {
        return (SelectInterest[]) $VALUES.clone();
    }

    public final int getFlag() {
        return this.flag;
    }
}
