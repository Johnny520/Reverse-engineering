.class public final synthetic Lio/sentry/android/replay/capture/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/util/Date;

.field public final synthetic d:Lio/sentry/protocol/t;

.field public final synthetic e:Lio/sentry/android/replay/w;

.field public final synthetic f:LBn;

.field public final synthetic g:Lio/sentry/android/replay/capture/e;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/capture/h;JLjava/util/Date;Lio/sentry/protocol/t;Lio/sentry/android/replay/w;Lfj;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lio/sentry/android/replay/capture/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/capture/f;->g:Lio/sentry/android/replay/capture/e;

    iput-wide p2, p0, Lio/sentry/android/replay/capture/f;->b:J

    iput-object p4, p0, Lio/sentry/android/replay/capture/f;->c:Ljava/util/Date;

    iput-object p5, p0, Lio/sentry/android/replay/capture/f;->d:Lio/sentry/protocol/t;

    iput-object p6, p0, Lio/sentry/android/replay/capture/f;->e:Lio/sentry/android/replay/w;

    check-cast p7, LBn;

    iput-object p7, p0, Lio/sentry/android/replay/capture/f;->f:LBn;

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/android/replay/capture/q;JLjava/util/Date;Lio/sentry/protocol/t;Lio/sentry/android/replay/w;Lfj;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lio/sentry/android/replay/capture/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/capture/f;->g:Lio/sentry/android/replay/capture/e;

    iput-wide p2, p0, Lio/sentry/android/replay/capture/f;->b:J

    iput-object p4, p0, Lio/sentry/android/replay/capture/f;->c:Ljava/util/Date;

    iput-object p5, p0, Lio/sentry/android/replay/capture/f;->d:Lio/sentry/protocol/t;

    iput-object p6, p0, Lio/sentry/android/replay/capture/f;->e:Lio/sentry/android/replay/w;

    check-cast p7, LBn;

    iput-object p7, p0, Lio/sentry/android/replay/capture/f;->f:LBn;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    iget v0, p0, Lio/sentry/android/replay/capture/f;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->g:Lio/sentry/android/replay/capture/e;

    move-object v1, v0

    check-cast v1, Lio/sentry/android/replay/capture/q;

    invoke-virtual {v1}, Lio/sentry/android/replay/capture/e;->j()I

    move-result v6

    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->e:Lio/sentry/android/replay/w;

    iget v7, v0, Lio/sentry/android/replay/w;->b:I

    iget v8, v0, Lio/sentry/android/replay/w;->a:I

    iget v9, v0, Lio/sentry/android/replay/w;->e:I

    iget v10, v0, Lio/sentry/android/replay/w;->f:I

    iget-wide v2, p0, Lio/sentry/android/replay/capture/f;->b:J

    iget-object v4, p0, Lio/sentry/android/replay/capture/f;->c:Ljava/util/Date;

    iget-object v5, p0, Lio/sentry/android/replay/capture/f;->d:Lio/sentry/protocol/t;

    invoke-static/range {v1 .. v10}, Lio/sentry/android/replay/capture/e;->h(Lio/sentry/android/replay/capture/e;JLjava/util/Date;Lio/sentry/protocol/t;IIIII)Lio/sentry/android/replay/capture/m;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/android/replay/capture/f;->f:LBn;

    invoke-interface {v1, v0}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->g:Lio/sentry/android/replay/capture/e;

    move-object v1, v0

    check-cast v1, Lio/sentry/android/replay/capture/h;

    invoke-virtual {v1}, Lio/sentry/android/replay/capture/e;->j()I

    move-result v6

    iget-object v0, p0, Lio/sentry/android/replay/capture/f;->e:Lio/sentry/android/replay/w;

    iget v7, v0, Lio/sentry/android/replay/w;->b:I

    iget v8, v0, Lio/sentry/android/replay/w;->a:I

    iget v9, v0, Lio/sentry/android/replay/w;->e:I

    iget v10, v0, Lio/sentry/android/replay/w;->f:I

    iget-wide v2, p0, Lio/sentry/android/replay/capture/f;->b:J

    iget-object v4, p0, Lio/sentry/android/replay/capture/f;->c:Ljava/util/Date;

    iget-object v5, p0, Lio/sentry/android/replay/capture/f;->d:Lio/sentry/protocol/t;

    invoke-static/range {v1 .. v10}, Lio/sentry/android/replay/capture/e;->h(Lio/sentry/android/replay/capture/e;JLjava/util/Date;Lio/sentry/protocol/t;IIIII)Lio/sentry/android/replay/capture/m;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/android/replay/capture/f;->f:LBn;

    invoke-interface {v1, v0}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
