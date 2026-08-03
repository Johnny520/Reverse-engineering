.class public final Le/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:Le/p;

.field private final e:Z


# direct methods
.method public constructor <init>(IIILe/p;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, La/b;->k(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p2}, La/b;->k(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p3}, La/b;->k(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iput p1, p0, Le/l;->a:I

    iput p2, p0, Le/l;->b:I

    iput p3, p0, Le/l;->c:I

    iput-object p4, p0, Le/l;->d:Le/p;

    iput-boolean p5, p0, Le/l;->e:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bogus nextOpcode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bogus family"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bogus opcode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Le/l;->b:I

    return v0
.end method

.method public final b()Le/p;
    .locals 1

    iget-object v0, p0, Le/l;->d:Le/p;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget v0, p0, Le/l;->a:I

    invoke-static {v0}, Lh/c;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Le/l;->c:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Le/l;->a:I

    return v0
.end method

.method public final f()Le/l;
    .locals 3

    iget v0, p0, Le/l;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "bogus opcode: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object v0, Le/m;->Z:Le/l;

    return-object v0

    :pswitch_1
    sget-object v0, Le/m;->a0:Le/l;

    return-object v0

    :pswitch_2
    sget-object v0, Le/m;->X:Le/l;

    return-object v0

    :pswitch_3
    sget-object v0, Le/m;->Y:Le/l;

    return-object v0

    :pswitch_4
    sget-object v0, Le/m;->V:Le/l;

    return-object v0

    :pswitch_5
    sget-object v0, Le/m;->W:Le/l;

    return-object v0

    :pswitch_6
    sget-object v0, Le/m;->T:Le/l;

    return-object v0

    :pswitch_7
    sget-object v0, Le/m;->U:Le/l;

    return-object v0

    :pswitch_8
    sget-object v0, Le/m;->R:Le/l;

    return-object v0

    :pswitch_9
    sget-object v0, Le/m;->S:Le/l;

    return-object v0

    :pswitch_a
    sget-object v0, Le/m;->P:Le/l;

    return-object v0

    :pswitch_b
    sget-object v0, Le/m;->Q:Le/l;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x32
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Le/l;->e:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Le/l;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
