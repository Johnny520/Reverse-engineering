.class public final synthetic LKh;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LKh;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    iget v0, p0, LKh;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/io/File;

    check-cast p2, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Lio/sentry/g0;

    check-cast p2, Lio/sentry/g0;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lio/sentry/g0;->u()Lio/sentry/H1;

    move-result-object v0

    invoke-interface {p2}, Lio/sentry/g0;->u()Lio/sentry/H1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/H1;->a(Lio/sentry/H1;)I

    move-result v0

    if-eqz v0, :cond_1

    move p1, v0

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lio/sentry/g0;->m()Lio/sentry/H2;

    move-result-object p1

    iget-object p1, p1, Lio/sentry/H2;->b:Lio/sentry/K2;

    invoke-virtual {p1}, Lio/sentry/K2;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2}, Lio/sentry/g0;->m()Lio/sentry/H2;

    move-result-object p2

    iget-object p2, p2, Lio/sentry/H2;->b:Lio/sentry/K2;

    invoke-virtual {p2}, Lio/sentry/K2;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    :goto_0
    return p1

    :pswitch_1
    check-cast p1, [B

    check-cast p2, [B

    array-length v0, p1

    array-length v1, p2

    if-eq v0, v1, :cond_2

    array-length p1, p1

    array-length p2, p2

    sub-int/2addr p1, p2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    array-length v2, p1

    if-ge v1, v2, :cond_4

    aget-byte v2, p1, v1

    aget-byte v3, p2, v1

    if-eq v2, v3, :cond_3

    sub-int p1, v2, v3

    goto :goto_2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    move p1, v0

    :goto_2
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
