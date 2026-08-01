.class public final Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
.super Ljava/lang/Object;
.source "NumberEncodeValueMatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\u0008\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0002B\u000f\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0017\u0008\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001aJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001d"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;",
        "",
        "()V",
        "value",
        "",
        "(Ljava/lang/Number;)V",
        "Lorg/luckypray/dexkit/query/base/INumberEncodeValue;",
        "type",
        "Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;",
        "(Lorg/luckypray/dexkit/query/base/INumberEncodeValue;Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;)V",
        "<set-?>",
        "getType",
        "()Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;",
        "getValue",
        "()Lorg/luckypray/dexkit/query/base/INumberEncodeValue;",
        "byteValue",
        "",
        "doubleValue",
        "",
        "floatValue",
        "",
        "intValue",
        "",
        "longValue",
        "",
        "shortValue",
        "",
        "number",
        "Companion",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;


# instance fields
.field private synthetic type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

.field private synthetic value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Number;)V
    .locals 1
    .param p1, "value"    # Ljava/lang/Number;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 55
    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/query/base/INumberEncodeValue;Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;)V
    .locals 0
    .param p1, "value"    # Lorg/luckypray/dexkit/query/base/INumberEncodeValue;
    .param p2, "type"    # Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 59
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 60
    return-void
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final create(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->create(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createByte(B)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createByte(B)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createDouble(D)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createDouble(D)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createFloat(F)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createFloat(F)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createInt(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createInt(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createLong(J)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createLong(J)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method

.method public static final createShort(S)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createShort(S)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # B

    .line 89
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    const/4 v1, 0x0

    .line 90
    .local v1, "$i$a$-also-NumberEncodeValueMatcher$byteValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/EncodeValueByte;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueByte;-><init>(B)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 91
    sget-object v2, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->ByteValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 92
    nop

    .line 89
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .end local v1    # "$i$a$-also-NumberEncodeValueMatcher$byteValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 92
    return-object v0
.end method

.method public final doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # D

    .line 154
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    const/4 v1, 0x0

    .line 155
    .local v1, "$i$a$-also-NumberEncodeValueMatcher$doubleValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;

    invoke-direct {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;-><init>(D)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 156
    sget-object v2, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->DoubleValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 157
    nop

    .line 154
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .end local v1    # "$i$a$-also-NumberEncodeValueMatcher$doubleValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 157
    return-object v0
.end method

.method public final floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # F

    .line 141
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    const/4 v1, 0x0

    .line 142
    .local v1, "$i$a$-also-NumberEncodeValueMatcher$floatValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;-><init>(F)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 143
    sget-object v2, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->FloatValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 144
    nop

    .line 141
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .end local v1    # "$i$a$-also-NumberEncodeValueMatcher$floatValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 144
    return-object v0
.end method

.method public final getType()Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;
    .locals 1

    .line 40
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    return-object v0
.end method

.method public final getValue()Lorg/luckypray/dexkit/query/base/INumberEncodeValue;
    .locals 1

    .line 37
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    return-object v0
.end method

.method public final intValue(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # I

    .line 115
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    const/4 v1, 0x0

    .line 116
    .local v1, "$i$a$-also-NumberEncodeValueMatcher$intValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;-><init>(I)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 117
    sget-object v2, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->IntValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 118
    nop

    .line 115
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .end local v1    # "$i$a$-also-NumberEncodeValueMatcher$intValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 118
    return-object v0
.end method

.method public final longValue(J)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # J

    .line 128
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    const/4 v1, 0x0

    .line 129
    .local v1, "$i$a$-also-NumberEncodeValueMatcher$longValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;

    invoke-direct {v2, p1, p2}, Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;-><init>(J)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 130
    sget-object v2, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->LongValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 131
    nop

    .line 128
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .end local v1    # "$i$a$-also-NumberEncodeValueMatcher$longValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 131
    return-object v0
.end method

.method public final shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 3
    .param p1, "value"    # S

    .line 102
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    const/4 v1, 0x0

    .line 103
    .local v1, "$i$a$-also-NumberEncodeValueMatcher$shortValue$1":I
    new-instance v2, Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;

    invoke-direct {v2, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;-><init>(S)V

    check-cast v2, Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 104
    sget-object v2, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->ShortValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    iput-object v2, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 105
    nop

    .line 102
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .end local v1    # "$i$a$-also-NumberEncodeValueMatcher$shortValue$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 105
    return-object v0
.end method

.method public final value(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 4
    .param p1, "number"    # Ljava/lang/Number;

    const-string v0, "number"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .local v0, "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    const/4 v1, 0x0

    .line 71
    .local v1, "$i$a$-also-NumberEncodeValueMatcher$value$1":I
    nop

    .line 72
    instance-of v2, p1, Ljava/lang/Byte;

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    goto :goto_0

    .line 73
    :cond_0
    instance-of v2, p1, Ljava/lang/Short;

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    goto :goto_0

    .line 74
    :cond_1
    instance-of v2, p1, Ljava/lang/Integer;

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->intValue(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    goto :goto_0

    .line 75
    :cond_2
    instance-of v2, p1, Ljava/lang/Long;

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->longValue(J)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    goto :goto_0

    .line 76
    :cond_3
    instance-of v2, p1, Ljava/lang/Float;

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    goto :goto_0

    .line 77
    :cond_4
    instance-of v2, p1, Ljava/lang/Double;

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 79
    :cond_5
    :goto_0
    nop

    .line 70
    .end local v0    # "it":Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .end local v1    # "$i$a$-also-NumberEncodeValueMatcher$value$1":I
    move-object v0, p0

    check-cast v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 79
    return-object v0
.end method
