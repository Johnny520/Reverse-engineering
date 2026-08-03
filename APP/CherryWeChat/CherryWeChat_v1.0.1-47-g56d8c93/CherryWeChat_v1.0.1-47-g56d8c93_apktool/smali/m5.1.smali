.class public final synthetic Lm5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LX7;ILW7;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lm5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm5;->c:Ljava/lang/Object;

    iput p2, p0, Lm5;->b:I

    iput-object p3, p0, Lm5;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/youth/banner/adapter/BannerAdapter;Ljava/lang/Object;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lm5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm5;->c:Ljava/lang/Object;

    iput-object p2, p0, Lm5;->d:Ljava/lang/Object;

    iput p3, p0, Lm5;->b:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    iget v0, p0, Lm5;->a:I

    iget-object v1, p0, Lm5;->d:Ljava/lang/Object;

    iget v2, p0, Lm5;->b:I

    iget-object v3, p0, Lm5;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v3, LX7;

    check-cast v1, LW7;

    iget-object v4, v3, LX7;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    sget-object p1, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v2, -0x1c7c7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    const/16 v9, 0x3e

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lra;->k0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj;I)Ljava/lang/String;

    move-result-object p1

    const-wide v2, -0x2fb30fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-wide v2, -0x2fb35fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    :pswitch_0
    check-cast v3, Lcom/youth/banner/adapter/BannerAdapter;

    invoke-static {v3, v1, v2, p1}, Lcom/youth/banner/adapter/BannerAdapter;->a(Lcom/youth/banner/adapter/BannerAdapter;Ljava/lang/Object;ILandroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
