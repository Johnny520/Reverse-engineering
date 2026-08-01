.class public final synthetic Lca0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic α:Lcom/example/dyhelper/ui/GestureAreaView;

.field public final synthetic β:Landroid/app/Activity;

.field public final synthetic γ:Landroid/widget/TextView;

.field public final synthetic δ:Landroid/widget/TextView;

.field public final synthetic ε:Landroid/widget/TextView;

.field public final synthetic ζ:Landroid/widget/Switch;

.field public final synthetic η:Landroid/widget/TextView;

.field public final synthetic θ:Lxx;

.field public final synthetic ι:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/app/Activity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lca0;->α:Lcom/example/dyhelper/ui/GestureAreaView;

    .line 5
    .line 6
    iput-object p2, p0, Lca0;->β:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lca0;->γ:Landroid/widget/TextView;

    .line 9
    .line 10
    iput-object p4, p0, Lca0;->δ:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p5, p0, Lca0;->ε:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p6, p0, Lca0;->ζ:Landroid/widget/Switch;

    .line 15
    .line 16
    iput-object p7, p0, Lca0;->η:Landroid/widget/TextView;

    .line 17
    .line 18
    iput-object p8, p0, Lca0;->θ:Lxx;

    .line 19
    .line 20
    iput-object p9, p0, Lca0;->ι:Landroid/widget/TextView;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p1, "gesture_enabled"

    .line 5
    .line 6
    invoke-static {p1, p2}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lca0;->α:Lcom/example/dyhelper/ui/GestureAreaView;

    .line 10
    .line 11
    iget-object v1, p0, Lca0;->γ:Landroid/widget/TextView;

    .line 12
    .line 13
    iget-object v2, p0, Lca0;->δ:Landroid/widget/TextView;

    .line 14
    .line 15
    iget-object v3, p0, Lca0;->ε:Landroid/widget/TextView;

    .line 16
    .line 17
    iget-object v4, p0, Lca0;->ζ:Landroid/widget/Switch;

    .line 18
    .line 19
    iget-object v5, p0, Lca0;->η:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object v6, p0, Lca0;->θ:Lxx;

    .line 22
    .line 23
    iget-object v7, p0, Lca0;->ι:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-static/range {v0 .. v7}, Lia0;->ι(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;)V

    .line 26
    .line 27
    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    invoke-virtual {v0, p1}, Lcom/example/dyhelper/ui/GestureAreaView;->γ(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-gtz p1, :cond_0

    .line 36
    .line 37
    const-string p1, "\u8bf7\u5148\u914d\u7f6e\u533a\u57df\u52a8\u4f5c\uff0c\u672a\u914d\u7f6e\u65f6\u4e0d\u4f1a\u89e6\u53d1"

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    iget-object p0, p0, Lca0;->β:Landroid/app/Activity;

    .line 41
    .line 42
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method
