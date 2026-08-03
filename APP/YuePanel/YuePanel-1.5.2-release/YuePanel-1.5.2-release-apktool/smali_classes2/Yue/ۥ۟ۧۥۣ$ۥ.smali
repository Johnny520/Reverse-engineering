.class public final LYue/ۥ۟ۧۥۣ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۧۥۣ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public static synthetic ۥ(LYue/ۥ۟ۧۥۣ;LYue/ۥۣۣ۠ۢ;LYue/ۥ۠ۥۧۨ;ILjava/lang/Object;)LYue/ۥۣ۟ۧۡ;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, LYue/ۥ۠ۥۧۨ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۧۨ;

    :cond_0
    invoke-interface {p0, p1, p2}, LYue/ۥ۟ۧۥۣ;->ۥ۟۟۟(LYue/ۥۣۣ۠ۢ;LYue/ۥ۠ۥۧۨ;)LYue/ۥۣ۟ۧۡ;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: callsInPlace"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
