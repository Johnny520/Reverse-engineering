.class public abstract LYue/ۥۣۣۣ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠ۢ;
.implements Ljava/io/Serializable;
.implements LYue/ۥۣ۠۠ۨ;
.implements LYue/ۥۣ۠ۡ۟;
.implements LYue/ۥۣ۠ۢۢ;
.implements LYue/ۥۣ۠ۢۤ;
.implements LYue/ۥۣ۠ۢۥ;
.implements LYue/ۥۣ۠ۢۦ;
.implements LYue/ۥۣ۠ۢۧ;
.implements LYue/ۥۣ۠ۢۨ;
.implements LYue/ۥۣۣ۠;
.implements LYue/ۥۣۣ۠۟;
.implements LYue/ۥۣ۠ۡ;
.implements LYue/ۥۣ۠ۡ۠;
.implements LYue/ۥۣ۠ۡۡ;
.implements LYue/ۥۣ۠ۡۢ;
.implements LYue/ۥۣۣ۠ۡ;
.implements LYue/ۥۣ۠ۡۤ;
.implements LYue/ۥۣ۠ۡۥ;
.implements LYue/ۥۣ۠ۡۦ;
.implements LYue/ۥۣ۠ۡۧ;
.implements LYue/ۥۣ۠ۡۨ;
.implements LYue/ۥۣ۠ۢ۟;
.implements LYue/ۥۣ۠ۢ۠;
.implements LYue/ۥۣ۠ۢۡ;


# annotations
.annotation runtime LYue/ۥ۟ۨۨۦ;
    level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
    message = "This class is no longer supported, do not use it."
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getArity()I
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    .line 4
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x2

    .line 5
    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    .line 6
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(I)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣۣۣ۠;->getArity()I

    move-result v0

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟۟(I)V

    :cond_0
    return-void
.end method

.method public varargs ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ۥ۟۟۟۟(I)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong function arity, expected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", actual: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۣۣۣ۠;->getArity()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p11}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    move-object v0, p0

    const/16 v1, 0x12

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p18}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/16 v0, 0xc

    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p12}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    move-object v0, p0

    const/16 v1, 0x13

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p19}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public ۥۣ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    move-object v0, p0

    const/16 v1, 0x10

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p16}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public ۥ۟۟ۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array {p1, p2, p3, p4}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p8}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    move-object v0, p0

    const/16 v1, 0x14

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p20}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public ۥ۟۟ۡۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    move-object v0, p0

    const/16 v1, 0x16

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p22}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public ۥ۟۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/16 v0, 0xd

    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p13}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p6}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/16 v0, 0xe

    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p14}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۢۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    move-object v0, p0

    const/16 v1, 0x11

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p17}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public ۥۣ۟۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/16 v0, 0x9

    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p9}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۢۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array {p1, p2, p3, p4, p5}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۢۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    move-object v0, p0

    const/16 v1, 0x15

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p21}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public ۥۣ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x7

    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p7}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥۣ۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p10}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥۣ۟۟ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    move-object v0, p0

    const/16 v1, 0xf

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟(I)V

    filled-new-array/range {p1 .. p15}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, LYue/ۥۣۣۣ۠;->ۥ۟۟۟([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method
