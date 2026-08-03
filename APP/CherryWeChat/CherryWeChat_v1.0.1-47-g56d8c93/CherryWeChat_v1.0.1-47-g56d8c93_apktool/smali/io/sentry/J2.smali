.class public final synthetic Lio/sentry/J2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/util/c;
.implements Lio/sentry/s1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/protocol/t;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    iput p1, p0, Lio/sentry/J2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/sentry/J2;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 2
    iput p2, p0, Lio/sentry/J2;->a:I

    iput-object p1, p0, Lio/sentry/J2;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lio/sentry/X;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/J2;->b:Ljava/lang/String;

    invoke-interface {p1, v0}, Lio/sentry/X;->H(Ljava/lang/String;)V

    return-void
.end method

.method public c()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lio/sentry/J2;->a:I

    iget-object v1, p0, Lio/sentry/J2;->b:Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/sentry/util/j;->a:Ljava/nio/charset/Charset;

    const-string v0, "0000-0000"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "00000000-0000-0000-0000-000000000000"

    :cond_0
    const-string v0, "-"

    const-string v2, ""

    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
