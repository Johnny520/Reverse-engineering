.class public final LK7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LNd;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    iput p2, p0, LK7;->a:I

    iput-object p1, p0, LK7;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final r(Landroid/widget/EditText;)V
    .locals 5

    iget v0, p0, LK7;->a:I

    iget-object v1, p0, LK7;->b:Landroid/view/View;

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/16 v3, 0x3c

    if-le v0, v3, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v3, -0xd5ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v2, -0xd6dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, LNx;->e(Ljava/lang/String;Ljava/lang/String;)V

    instance-of v0, v1, LyA;

    if-eqz v0, :cond_1

    check-cast v1, LyA;

    invoke-virtual {v1, p1}, LyA;->setValue(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0xd67fffff835L

    invoke-static {v0, v1, p1, v2}, LEy;->k(JLandroid/content/Context;I)V

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    :try_start_1
    invoke-static {p1}, Lzz;->E(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_3

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0x1967fffff835L

    invoke-static {v0, v1, p1, v2}, LEy;->k(JLandroid/content/Context;I)V

    goto :goto_2

    :cond_3
    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v2, -0x1970fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, LNx;->e(Ljava/lang/String;Ljava/lang/String;)V

    instance-of v0, v1, LyA;

    if-eqz v0, :cond_4

    check-cast v1, LyA;

    invoke-virtual {v1, p1}, LyA;->setValue(Ljava/lang/String;)V

    :cond_4
    :goto_2
    return-void

    :pswitch_1
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_5

    const-wide v3, -0x1bcffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0x1be4fffff835L

    invoke-static {v0, v1, p1, v2}, LEy;->k(JLandroid/content/Context;I)V

    goto :goto_3

    :cond_5
    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v2, -0x1beffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, LNx;->e(Ljava/lang/String;Ljava/lang/String;)V

    instance-of v0, v1, LyA;

    if-eqz v0, :cond_6

    check-cast v1, LyA;

    invoke-virtual {v1, p1}, LyA;->setValue(Ljava/lang/String;)V

    :cond_6
    :goto_3
    return-void

    :pswitch_2
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :try_start_2
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {v0, p1, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v2, -0xe70ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, LNx;->e(Ljava/lang/String;Ljava/lang/String;)V

    instance-of v0, v1, LyA;

    if-eqz v0, :cond_7

    check-cast v1, LyA;

    invoke-virtual {v1, p1}, LyA;->setValue(Ljava/lang/String;)V

    goto :goto_4

    :catchall_0
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-wide v0, -0xe708fffff835L

    invoke-static {v0, v1, p1, v2}, LEy;->k(JLandroid/content/Context;I)V

    :cond_7
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
