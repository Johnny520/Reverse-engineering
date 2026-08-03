.class public final Lk5/r;
.super Lk5/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lk5/r;->g:I

    .line 2
    .line 3
    iput-object p3, p0, Lk5/r;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput p1, p0, Lk5/r;->h:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lk5/r;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ll5/b0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, Ll5/b0;-><init>(Lk5/t;II)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :pswitch_0
    iget-object v0, p0, Lk5/r;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lk5/u;

    .line 16
    .line 17
    iget v1, v0, Lk5/u;->p:I

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x4

    .line 20
    .line 21
    mul-int/lit8 p1, p1, 0xc

    .line 22
    .line 23
    add-int/2addr p1, v1

    .line 24
    new-instance v1, Lm5/b;

    .line 25
    .line 26
    invoke-direct {v1, v0, p1}, Lm5/b;-><init>(Lk5/u;I)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, Lk5/r;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/r;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ll5/c0;

    .line 9
    .line 10
    iget v0, v0, Ll5/c0;->d:I

    .line 11
    .line 12
    return v0

    .line 13
    :pswitch_0
    iget v0, p0, Lk5/r;->h:I

    .line 14
    .line 15
    return v0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
