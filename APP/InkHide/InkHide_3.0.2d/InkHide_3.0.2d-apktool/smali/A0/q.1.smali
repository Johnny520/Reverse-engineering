.class public final synthetic LA0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;II)V
    .locals 0

    .line 1
    iput p3, p0, LA0/q;->a:I

    iput-object p1, p0, LA0/q;->c:Landroid/view/View;

    iput p2, p0, LA0/q;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, LA0/q;->b:I

    .line 2
    .line 3
    iget-object v1, p0, LA0/q;->c:Landroid/view/View;

    .line 4
    .line 5
    iget v2, p0, LA0/q;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v2, Lz0/w;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    sget-object v2, Lr0/f1;->j:[Ljava/lang/String;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {v1, v0, v2, v3}, Lz0/w;->o(Landroid/view/View;I[Ljava/lang/String;I)I

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v3}, Lz0/w;->p(Landroid/view/View;I)I

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    const-string v2, "progress"

    .line 23
    .line 24
    check-cast v1, Landroid/widget/LinearLayout;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Landroid/widget/ProgressBar;

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
