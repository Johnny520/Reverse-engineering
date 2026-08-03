.class public abstract Lcom/yuexin/panel/panel/voice/items/base/MainItems;
.super Ljava/lang/Object;


# annotations
.annotation build LYue/ۥ۠ۦۥ;
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x38d

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract buildView(Landroid/content/Context;ILjava/lang/String;)Landroid/view/View;
.end method

.method public abstract getInitMap()Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List;",
            ">;"
        }
    .end annotation
.end method

.method public native onActivityResult(Landroid/content/Intent;Ljava/util/List;Z)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;Z)V"
        }
    .end annotation
.end method

.method public abstract onBuild(Landroid/view/View;Landroid/content/Context;Landroid/widget/LinearLayout;)V
.end method

.method public native onLast(Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/lang/String;)V
.end method

.method public native onMore(Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/lang/String;)V
.end method

.method public native onNext(Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/lang/String;)V
.end method

.method public abstract onNextItem(Landroid/content/Context;Landroid/widget/LinearLayout;)V
.end method

.method public native onSearch(Ljava/lang/String;Landroid/content/Context;Landroid/widget/LinearLayout;)V
.end method
