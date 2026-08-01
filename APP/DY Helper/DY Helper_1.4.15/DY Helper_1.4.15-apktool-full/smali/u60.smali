.class public final Lu60;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Z

.field public final β:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public γ:Lp80;

.field public final synthetic δ:Lb70;


# direct methods
.method public constructor <init>(Lb70;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu60;->δ:Lb70;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lu60;->α:Z

    .line 8
    .line 9
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lu60;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 15
    .line 16
    return-void
.end method
