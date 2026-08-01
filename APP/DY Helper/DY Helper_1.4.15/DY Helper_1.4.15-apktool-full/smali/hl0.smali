.class public final synthetic Lhl0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Landroid/view/Window;

.field public final synthetic ζ:Z

.field public final synthetic η:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhl0;->ε:Landroid/view/Window;

    .line 5
    .line 6
    iput-boolean p2, p0, Lhl0;->ζ:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lhl0;->η:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lhl0;->ε:Landroid/view/Window;

    .line 2
    .line 3
    iget-boolean v1, p0, Lhl0;->ζ:Z

    .line 4
    .line 5
    iget-boolean p0, p0, Lhl0;->η:Z

    .line 6
    .line 7
    :try_start_0
    invoke-static {v0, v1, p0}, Lil0;->β(Landroid/view/Window;ZZ)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    :catchall_0
    return-void
.end method
