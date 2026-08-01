.class public final synthetic Ly10;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic α:Lk20;


# direct methods
.method public synthetic constructor <init>(Lk20;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly10;->α:Lk20;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    sget-object p2, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ly10;->α:Lk20;

    .line 7
    .line 8
    invoke-static {p1, p0}, Lcom/example/dyhelper/hook/γ;->г(Landroid/view/View;Lk20;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
