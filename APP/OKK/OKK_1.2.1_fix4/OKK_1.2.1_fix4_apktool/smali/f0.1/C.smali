.class public final synthetic Lf0/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/p;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lf0/C;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, LD0/l;->a:LD0/l;

    const-string v1, "cb"

    const-string v2, "act"

    iget v3, p0, Lf0/C;->a:I

    check-cast p1, Landroid/app/Activity;

    check-cast p2, LP0/a;

    packed-switch v3, :pswitch_data_0

    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    new-instance v1, Lf0/k;

    const/4 v2, 0x3

    invoke-direct {v1, p1, v2}, Lf0/k;-><init>(Landroid/app/Activity;I)V

    const-string v2, "PC \u767b\u5f55\u81ea\u52a8\u5316\u9009\u9879"

    invoke-static {p1, v2, p2, v1}, Lf0/V;->y(Landroid/app/Activity;Ljava/lang/String;LP0/a;LP0/l;)V

    return-object v0

    :pswitch_0
    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    new-instance v1, Lf0/k;

    const/16 v2, 0x9

    invoke-direct {v1, p1, v2}, Lf0/k;-><init>(Landroid/app/Activity;I)V

    const-string v2, "\u865a\u62df\u5b9a\u4f4d\u8bbe\u7f6e"

    invoke-static {p1, v2, p2, v1}, Lf0/V;->y(Landroid/app/Activity;Ljava/lang/String;LP0/a;LP0/l;)V

    return-object v0

    :pswitch_1
    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    new-instance v1, Lf0/k;

    const/4 v2, 0x6

    invoke-direct {v1, p1, v2}, Lf0/k;-><init>(Landroid/app/Activity;I)V

    const-string v2, "\u4e3b\u9898\u58c1\u7eb8\u914d\u7f6e"

    invoke-static {p1, v2, p2, v1}, Lf0/V;->y(Landroid/app/Activity;Ljava/lang/String;LP0/a;LP0/l;)V

    return-object v0

    :pswitch_2
    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    new-instance v1, Lf0/k;

    const/4 v2, 0x5

    invoke-direct {v1, p1, v2}, Lf0/k;-><init>(Landroid/app/Activity;I)V

    const-string v2, "\u5706\u5f62\u5934\u50cf\u8bbe\u7f6e"

    invoke-static {p1, v2, p2, v1}, Lf0/V;->y(Landroid/app/Activity;Ljava/lang/String;LP0/a;LP0/l;)V

    return-object v0

    :pswitch_3
    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    new-instance v1, Lf0/k;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lf0/k;-><init>(Landroid/app/Activity;I)V

    const-string v2, "\u6c14\u6ce1\u76ae\u80a4\u8bbe\u7f6e"

    invoke-static {p1, v2, p2, v1}, Lf0/V;->y(Landroid/app/Activity;Ljava/lang/String;LP0/a;LP0/l;)V

    return-object v0

    :pswitch_4
    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    new-instance v1, Lf0/k;

    const/16 v2, 0xa

    invoke-direct {v1, p1, v2}, Lf0/k;-><init>(Landroid/app/Activity;I)V

    const-string v2, "\u8f93\u5165\u6846\u63d0\u793a"

    invoke-static {p1, v2, p2, v1}, Lf0/V;->y(Landroid/app/Activity;Ljava/lang/String;LP0/a;LP0/l;)V

    return-object v0

    :pswitch_5
    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    new-instance v1, Lf0/k;

    const/16 v2, 0xb

    invoke-direct {v1, p1, v2}, Lf0/k;-><init>(Landroid/app/Activity;I)V

    const-string v2, "\u6d88\u606f\u5e95\u90e8\u683c\u5f0f"

    invoke-static {p1, v2, p2, v1}, Lf0/V;->y(Landroid/app/Activity;Ljava/lang/String;LP0/a;LP0/l;)V

    return-object v0

    :pswitch_6
    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    new-instance v1, Lf0/k;

    const/4 v2, 0x7

    invoke-direct {v1, p1, v2}, Lf0/k;-><init>(Landroid/app/Activity;I)V

    const-string v2, "\u5b9e\u540d\u4fe1\u606f\u6837\u5f0f"

    invoke-static {p1, v2, p2, v1}, Lf0/V;->y(Landroid/app/Activity;Ljava/lang/String;LP0/a;LP0/l;)V

    return-object v0

    :pswitch_7
    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    new-instance v1, Lf0/k;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lf0/k;-><init>(Landroid/app/Activity;I)V

    const-string v2, "\u7fa4\u5458\u5934\u8854\u6587\u6848"

    invoke-static {p1, v2, p2, v1}, Lf0/V;->y(Landroid/app/Activity;Ljava/lang/String;LP0/a;LP0/l;)V

    return-object v0

    :pswitch_8
    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    new-instance v1, Lf0/k;

    const/4 v2, 0x4

    invoke-direct {v1, p1, v2}, Lf0/k;-><init>(Landroid/app/Activity;I)V

    const-string v2, "\u60ac\u6d6e\u5e95\u680f\u914d\u7f6e"

    invoke-static {p1, v2, p2, v1}, Lf0/V;->y(Landroid/app/Activity;Ljava/lang/String;LP0/a;LP0/l;)V

    return-object v0

    :pswitch_9
    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    new-instance v1, Lf0/k;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lf0/k;-><init>(Landroid/app/Activity;I)V

    const-string v2, "\u4e0b\u8f7d\u91cd\u5b9a\u5411\u8bbe\u7f6e"

    invoke-static {p1, v2, p2, v1}, Lf0/V;->y(Landroid/app/Activity;Ljava/lang/String;LP0/a;LP0/l;)V

    return-object v0

    :pswitch_a
    invoke-static {p1, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lf0/V;->a:Lf0/V;

    new-instance v1, Lf0/k;

    const/16 v2, 0x8

    invoke-direct {v1, p1, v2}, Lf0/k;-><init>(Landroid/app/Activity;I)V

    const-string v2, "\u9632\u64a4\u56de\u8bbe\u7f6e"

    invoke-static {p1, v2, p2, v1}, Lf0/V;->y(Landroid/app/Activity;Ljava/lang/String;LP0/a;LP0/l;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
