.class public abstract LYue/ۥ۟ۨ۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۨ۟۠$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ:I = 0x0

.field public static final ۥ۟:I = 0x1

.field public static final ۥ۟۟:I = 0x2


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(I[D[[D)LYue/ۥ۟ۨ۟۠;
    .locals 3

    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v1, :cond_0

    move p0, v2

    :cond_0
    if-eqz p0, :cond_2

    if-eq p0, v2, :cond_1

    new-instance p0, LYue/ۥ۠ۧ۠ۤ;

    invoke-direct {p0, p1, p2}, LYue/ۥ۠ۧ۠ۤ;-><init>([D[[D)V

    return-object p0

    :cond_1
    new-instance p0, LYue/ۥ۟ۨ۟۠$ۥ;

    const/4 v0, 0x0

    aget-wide v1, p1, v0

    aget-object p1, p2, v0

    invoke-direct {p0, v1, v2, p1}, LYue/ۥ۟ۨ۟۠$ۥ;-><init>(D[D)V

    return-object p0

    :cond_2
    new-instance p0, LYue/ۥۡۡۤۧ;

    invoke-direct {p0, p1, p2}, LYue/ۥۡۡۤۧ;-><init>([D[[D)V

    return-object p0
.end method

.method public static ۥ۟([I[D[[D)LYue/ۥ۟ۨ۟۠;
    .locals 1

    new-instance v0, LYue/ۥ۟ۡۦ۠;

    invoke-direct {v0, p0, p1, p2}, LYue/ۥ۟ۡۦ۠;-><init>([I[D[[D)V

    return-object v0
.end method


# virtual methods
.method public abstract ۥ۟۟(DI)D
.end method

.method public abstract ۥ۟۟۟(D[D)V
.end method

.method public abstract ۥ۟۟۟۟(D[F)V
.end method

.method public abstract ۥ۟۟۟۠(DI)D
.end method

.method public abstract ۥ۟۟۟ۡ(D[D)V
.end method

.method public abstract ۥ۟۟۟ۢ()[D
.end method
