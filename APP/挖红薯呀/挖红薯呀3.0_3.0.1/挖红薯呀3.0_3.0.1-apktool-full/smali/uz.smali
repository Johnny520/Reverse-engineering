.class public final synthetic Luz;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Landroid/content/Context;

.field public final synthetic f:I

.field public final synthetic g:J

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lex;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;IJLsw;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Luz;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Luz;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Luz;->e:Landroid/content/Context;

    .line 10
    .line 11
    iput p3, p0, Luz;->f:I

    .line 12
    .line 13
    iput-wide p4, p0, Luz;->g:J

    .line 14
    .line 15
    iput-object p6, p0, Luz;->i:Lex;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lww;ILandroid/content/Context;J)V
    .locals 1

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Luz;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luz;->h:Ljava/lang/Object;

    iput-object p2, p0, Luz;->i:Lex;

    iput p3, p0, Luz;->f:I

    iput-object p4, p0, Luz;->e:Landroid/content/Context;

    iput-wide p5, p0, Luz;->g:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Luz;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Luz;->i:Lex;

    .line 4
    .line 5
    iget-object v2, p0, Luz;->h:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, Ljava/lang/String;

    .line 12
    .line 13
    iget-wide v6, p0, Luz;->g:J

    .line 14
    .line 15
    move-object v8, v1

    .line 16
    check-cast v8, Lsw;

    .line 17
    .line 18
    iget-object v4, p0, Luz;->e:Landroid/content/Context;

    .line 19
    .line 20
    iget v5, p0, Luz;->f:I

    .line 21
    .line 22
    invoke-static/range {v3 .. v8}, Lvz;->a(Ljava/lang/String;Landroid/content/Context;IJLsw;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    move-object v9, v2

    .line 27
    check-cast v9, Ljava/util/List;

    .line 28
    .line 29
    move-object v10, v1

    .line 30
    check-cast v10, Lww;

    .line 31
    .line 32
    iget-object v12, p0, Luz;->e:Landroid/content/Context;

    .line 33
    .line 34
    iget-wide v13, p0, Luz;->g:J

    .line 35
    .line 36
    iget v11, p0, Luz;->f:I

    .line 37
    .line 38
    invoke-static/range {v9 .. v14}, Lvz;->d(Ljava/util/List;Lww;ILandroid/content/Context;J)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
