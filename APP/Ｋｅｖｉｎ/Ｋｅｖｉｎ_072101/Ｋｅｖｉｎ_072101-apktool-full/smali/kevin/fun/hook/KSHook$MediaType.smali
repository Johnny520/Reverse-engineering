.class final enum Lkevin/fun/hook/KSHook$MediaType;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkevin/fun/hook/KSHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "MediaType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lkevin/fun/hook/KSHook$MediaType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ATLAS:Lkevin/fun/hook/KSHook$MediaType;

.field private static final ENUM$VALUES:[Lkevin/fun/hook/KSHook$MediaType;

.field public static final enum VIDEO:Lkevin/fun/hook/KSHook$MediaType;

.field private static final short:[S


# instance fields
.field final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v6, 0x2

    const/4 v5, 0x0

    const/16 v0, 0xe

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/KSHook$MediaType;->short:[S

    sget-object v0, Lkevin/fun/hook/KSHook$MediaType;->short:[S

    sget v1, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v1, v1, 0x22c

    const/16 v2, 0x6b6

    invoke-static {v0, v5, v1, v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/KSHook$MediaType;

    sget-object v2, Lkevin/fun/hook/KSHook$MediaType;->short:[S

    sget v3, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v3, v3, 0x1ef

    const/16 v4, 0x7e0

    invoke-static {v2, v6, v3, v4}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v5, v0}, Lkevin/fun/hook/KSHook$MediaType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lkevin/fun/hook/KSHook$MediaType;->VIDEO:Lkevin/fun/hook/KSHook$MediaType;

    sget-object v0, Lkevin/fun/hook/KSHook$MediaType;->short:[S

    const/4 v1, 0x7

    sget v2, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v2, v2, 0x70

    const/16 v3, 0xa40

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/KSHook$MediaType;

    sget-object v2, Lkevin/fun/hook/KSHook$MediaType;->short:[S

    const/16 v3, 0x9

    sget v4, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v4, v4, 0xf6

    const/16 v5, 0x7aa

    invoke-static {v2, v3, v4, v5}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v0}, Lkevin/fun/hook/KSHook$MediaType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lkevin/fun/hook/KSHook$MediaType;->ATLAS:Lkevin/fun/hook/KSHook$MediaType;

    sget-object v0, Lkevin/fun/hook/KSHook$MediaType;->VIDEO:Lkevin/fun/hook/KSHook$MediaType;

    sget-object v1, Lkevin/fun/hook/KSHook$MediaType;->ATLAS:Lkevin/fun/hook/KSHook$MediaType;

    new-array v2, v6, [Lkevin/fun/hook/KSHook$MediaType;

    sget v3, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v3, v3, 0x15f

    aput-object v0, v2, v3

    sget v0, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v0, v0, -0x65

    aput-object v1, v2, v0

    sput-object v2, Lkevin/fun/hook/KSHook$MediaType;->ENUM$VALUES:[Lkevin/fun/hook/KSHook$MediaType;

    return-void

    :array_0
    .array-data 2
        -0x7090s
        -0x61d9s
        0x7b6s
        0x7a9s
        0x7a4s
        0x7a5s
        0x7afs
        0x5cbes
        -0x637as
        0x7ebs
        0x7fes
        0x7e6s
        0x7ebs
        0x7f9s
    .end array-data
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lkevin/fun/hook/KSHook$MediaType;->name:Ljava/lang/String;

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "sP"

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۣۤۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lkevin/fun/hook/KSHook$MediaType;
    .locals 1

    const-class v0, Lkevin/fun/hook/KSHook$MediaType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lkevin/fun/hook/KSHook$MediaType;

    return-object v0
.end method

.method public static values()[Lkevin/fun/hook/KSHook$MediaType;
    .locals 4

    const/4 v3, 0x0

    sget-object v0, Lkevin/fun/hook/KSHook$MediaType;->ENUM$VALUES:[Lkevin/fun/hook/KSHook$MediaType;

    array-length v1, v0

    new-array v2, v1, [Lkevin/fun/hook/KSHook$MediaType;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
