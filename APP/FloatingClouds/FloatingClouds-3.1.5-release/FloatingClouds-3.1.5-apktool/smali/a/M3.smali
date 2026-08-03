.class public final La/M3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/M3$a;
    }
.end annotation


# instance fields
.field public a:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "La/M3;",
            ">;"
        }
    .end annotation
.end field

.field public final b:La/N3;

.field public final c:La/M3$a;

.field public d:La/M3;

.field public e:I

.field public f:I

.field public g:La/le;


# direct methods
.method public constructor <init>(La/N3;La/M3$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/M3;->a:Ljava/util/HashSet;

    const/4 v0, 0x0

    iput v0, p0, La/M3;->e:I

    const/4 v0, -0x1

    iput v0, p0, La/M3;->f:I

    iput-object p1, p0, La/M3;->b:La/N3;

    iput-object p2, p0, La/M3;->c:La/M3$a;

    return-void
.end method


# virtual methods
.method public final a(La/M3;I)V
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, La/M3;->b(La/M3;IIZ)Z

    return-void
.end method

.method public final b(La/M3;IIZ)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-virtual {p0}, La/M3;->h()V

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p4, :cond_1

    invoke-virtual {p0, p1}, La/M3;->g(La/M3;)Z

    move-result p4

    if-nez p4, :cond_1

    return v1

    :cond_1
    iput-object p1, p0, La/M3;->d:La/M3;

    iget-object p4, p1, La/M3;->a:Ljava/util/HashSet;

    if-nez p4, :cond_2

    new-instance p4, Ljava/util/HashSet;

    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    iput-object p4, p1, La/M3;->a:Ljava/util/HashSet;

    :cond_2
    iget-object p1, p0, La/M3;->d:La/M3;

    iget-object p1, p1, La/M3;->a:Ljava/util/HashSet;

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-lez p2, :cond_3

    iput p2, p0, La/M3;->e:I

    goto :goto_0

    :cond_3
    iput v1, p0, La/M3;->e:I

    :goto_0
    iput p3, p0, La/M3;->f:I

    return v0
.end method

.method public final c()I
    .locals 3

    iget-object v0, p0, La/M3;->b:La/N3;

    iget v0, v0, La/N3;->X:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, La/M3;->f:I

    const/4 v2, -0x1

    if-le v0, v2, :cond_1

    iget-object v2, p0, La/M3;->d:La/M3;

    if-eqz v2, :cond_1

    iget-object v2, v2, La/M3;->b:La/N3;

    iget v2, v2, La/N3;->X:I

    if-ne v2, v1, :cond_1

    return v0

    :cond_1
    iget v0, p0, La/M3;->e:I

    return v0
.end method

.method public final d()La/M3;
    .locals 3

    iget-object v0, p0, La/M3;->c:La/M3$a;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    iget-object v2, p0, La/M3;->b:La/N3;

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :pswitch_0
    iget-object v0, v2, La/N3;->z:La/M3;

    return-object v0

    :pswitch_1
    iget-object v0, v2, La/N3;->y:La/M3;

    return-object v0

    :pswitch_2
    iget-object v0, v2, La/N3;->B:La/M3;

    return-object v0

    :pswitch_3
    iget-object v0, v2, La/N3;->A:La/M3;

    return-object v0

    :pswitch_4
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public final e()Z
    .locals 3

    iget-object v0, p0, La/M3;->a:Ljava/util/HashSet;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/M3;

    invoke-virtual {v2}, La/M3;->d()La/M3;

    move-result-object v2

    invoke-virtual {v2}, La/M3;->f()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, La/M3;->d:La/M3;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g(La/M3;)Z
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    sget-object v1, La/M3$a;->e:La/M3$a;

    iget-object v2, p0, La/M3;->c:La/M3$a;

    const/4 v3, 0x1

    iget-object v4, p1, La/M3;->b:La/N3;

    iget-object p1, p1, La/M3;->c:La/M3$a;

    if-ne p1, v2, :cond_3

    if-ne v2, v1, :cond_2

    iget-boolean p1, v4, La/N3;->w:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, La/M3;->b:La/N3;

    iget-boolean p1, p1, La/N3;->w:Z

    if-nez p1, :cond_2

    :cond_1
    return v0

    :cond_2
    return v3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    sget-object v6, La/M3$a;->g:La/M3$a;

    sget-object v7, La/M3$a;->h:La/M3$a;

    packed-switch v5, :pswitch_data_0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_0
    if-eq p1, v1, :cond_4

    if-eq p1, v6, :cond_4

    if-eq p1, v7, :cond_4

    return v3

    :cond_4
    return v0

    :pswitch_1
    sget-object v1, La/M3$a;->b:La/M3$a;

    if-eq p1, v1, :cond_6

    sget-object v1, La/M3$a;->d:La/M3$a;

    if-ne p1, v1, :cond_5

    goto :goto_0

    :cond_5
    move v1, v0

    goto :goto_1

    :cond_6
    :goto_0
    move v1, v3

    :goto_1
    instance-of v2, v4, La/a8;

    if-eqz v2, :cond_9

    if-nez v1, :cond_8

    if-ne p1, v7, :cond_7

    goto :goto_2

    :cond_7
    return v0

    :cond_8
    :goto_2
    return v3

    :cond_9
    return v1

    :pswitch_2
    sget-object v1, La/M3$a;->a:La/M3$a;

    if-eq p1, v1, :cond_b

    sget-object v1, La/M3$a;->c:La/M3$a;

    if-ne p1, v1, :cond_a

    goto :goto_3

    :cond_a
    move v1, v0

    goto :goto_4

    :cond_b
    :goto_3
    move v1, v3

    :goto_4
    instance-of v2, v4, La/a8;

    if-eqz v2, :cond_e

    if-nez v1, :cond_d

    if-ne p1, v6, :cond_c

    goto :goto_5

    :cond_c
    return v0

    :cond_d
    :goto_5
    return v3

    :cond_e
    return v1

    :pswitch_3
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, La/M3;->d:La/M3;

    if-eqz v0, :cond_0

    iget-object v0, v0, La/M3;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, La/M3;->d:La/M3;

    const/4 v0, 0x0

    iput v0, p0, La/M3;->e:I

    const/4 v0, -0x1

    iput v0, p0, La/M3;->f:I

    return-void
.end method

.method public final i()V
    .locals 2

    iget-object v0, p0, La/M3;->g:La/le;

    if-nez v0, :cond_0

    new-instance v0, La/le;

    sget-object v1, La/le$a;->a:La/le$a;

    invoke-direct {v0, v1}, La/le;-><init>(La/le$a;)V

    iput-object v0, p0, La/M3;->g:La/le;

    return-void

    :cond_0
    invoke-virtual {v0}, La/le;->c()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, La/M3;->b:La/N3;

    iget-object v1, v1, La/N3;->Y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La/M3;->c:La/M3$a;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
