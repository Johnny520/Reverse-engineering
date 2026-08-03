.class public final Lff/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lfd/h;

.field public final b:Lff/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lfd/h;

    .line 5
    .line 6
    invoke-direct {v0}, Lfd/h;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lff/c;->a:Lfd/h;

    .line 10
    .line 11
    new-instance v1, Lff/a;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lff/a;-><init>(Lfd/h;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lff/c;->b:Lff/a;

    .line 17
    .line 18
    return-void
.end method
