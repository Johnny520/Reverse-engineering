.class public final synthetic Lio/sentry/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/FilenameFilter;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lio/sentry/u;->a:I

    iput-object p2, p0, Lio/sentry/u;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;Ljava/lang/String;)Z
    .locals 5

    iget v0, p0, Lio/sentry/u;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/u;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/j;

    const/4 v1, 0x0

    const-string v2, ".jpg"

    invoke-static {p2, v1, v2}, LBz;->J(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2}, Lwh;->c0(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LAz;->I(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    new-instance v3, Lio/sentry/android/replay/k;

    const/4 v4, 0x0

    invoke-direct {v3, v2, p1, p2, v4}, Lio/sentry/android/replay/k;-><init>(Ljava/io/File;JLjava/lang/String;)V

    iget-object p1, v0, Lio/sentry/android/replay/j;->h:Ljava/util/ArrayList;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return v1

    :pswitch_0
    iget-object p1, p0, Lio/sentry/u;->b:Ljava/lang/Object;

    check-cast p1, Lio/sentry/w;

    invoke-virtual {p1, p2}, Lio/sentry/w;->a(Ljava/lang/String;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
