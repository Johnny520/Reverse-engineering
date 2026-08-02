.class public final Lkd0;
.super Landroid/view/View;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic h:Lkk;


# direct methods
.method public constructor <init>(Lkk;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkd0;->h:Lkk;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lkd0;->h:Lkk;

    .line 5
    .line 6
    invoke-virtual {p0}, Lkk;->run()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
