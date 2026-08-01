.class public final synthetic Lvc0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Z

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lpe0;ZII)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lvc0;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lvc0;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lvc0;->e:Z

    .line 10
    .line 11
    iput p3, p0, Lvc0;->f:I

    .line 12
    .line 13
    iput p4, p0, Lvc0;->g:I

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(ZLww;II)V
    .locals 1

    .line 16
    const/4 v0, 0x1

    iput v0, p0, Lvc0;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lvc0;->e:Z

    iput-object p2, p0, Lvc0;->h:Ljava/lang/Object;

    iput p3, p0, Lvc0;->f:I

    iput p4, p0, Lvc0;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lvc0;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Lvc0;->h:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v3, v1

    .line 9
    check-cast v3, Lww;

    .line 10
    .line 11
    move-object v6, p1

    .line 12
    check-cast v6, Lji;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v7

    .line 20
    iget-boolean v2, p0, Lvc0;->e:Z

    .line 21
    .line 22
    iget v4, p0, Lvc0;->f:I

    .line 23
    .line 24
    iget v5, p0, Lvc0;->g:I

    .line 25
    .line 26
    invoke-static/range {v2 .. v7}, Lx71;->a(ZLww;IILji;I)Lna1;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    move-object v0, v1

    .line 32
    check-cast v0, Lpe0;

    .line 33
    .line 34
    move-object v4, p1

    .line 35
    check-cast v4, Lji;

    .line 36
    .line 37
    check-cast p2, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    iget-boolean v1, p0, Lvc0;->e:Z

    .line 44
    .line 45
    iget v2, p0, Lvc0;->f:I

    .line 46
    .line 47
    iget v3, p0, Lvc0;->g:I

    .line 48
    .line 49
    invoke-static/range {v0 .. v5}, Lzc0;->f(Lpe0;ZIILji;I)Lna1;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
