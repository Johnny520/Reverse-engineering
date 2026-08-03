.class public final Llq;
.super Lnq;
.source ""

# interfaces
.implements Ljava/util/Iterator;
.implements LMm;


# instance fields
.field public final synthetic e:I


# direct methods
.method public constructor <init>(Loq;I)V
    .locals 0

    iput p2, p0, Llq;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq;->d:Ljava/lang/Object;

    const/4 p2, -0x1

    iput p2, p0, Lnq;->b:I

    iget p1, p1, Loq;->h:I

    iput p1, p0, Lnq;->c:I

    invoke-virtual {p0}, Lnq;->e()V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Llq;->e:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lnq;->b()V

    iget v0, p0, Lnq;->a:I

    iget-object v1, p0, Lnq;->d:Ljava/lang/Object;

    check-cast v1, Loq;

    iget v2, v1, Loq;->f:I

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lnq;->a:I

    iput v0, p0, Lnq;->b:I

    iget-object v1, v1, Loq;->b:[Ljava/lang/Object;

    aget-object v0, v1, v0

    invoke-virtual {p0}, Lnq;->e()V

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_0
    invoke-virtual {p0}, Lnq;->b()V

    iget v0, p0, Lnq;->a:I

    iget-object v1, p0, Lnq;->d:Ljava/lang/Object;

    check-cast v1, Loq;

    iget v2, v1, Loq;->f:I

    if-ge v0, v2, :cond_1

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lnq;->a:I

    iput v0, p0, Lnq;->b:I

    iget-object v1, v1, Loq;->a:[Ljava/lang/Object;

    aget-object v0, v1, v0

    invoke-virtual {p0}, Lnq;->e()V

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_1
    invoke-virtual {p0}, Lnq;->b()V

    iget v0, p0, Lnq;->a:I

    iget-object v1, p0, Lnq;->d:Ljava/lang/Object;

    check-cast v1, Loq;

    iget v2, v1, Loq;->f:I

    if-ge v0, v2, :cond_2

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lnq;->a:I

    iput v0, p0, Lnq;->b:I

    new-instance v2, Lmq;

    invoke-direct {v2, v1, v0}, Lmq;-><init>(Loq;I)V

    invoke-virtual {p0}, Lnq;->e()V

    return-object v2

    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
