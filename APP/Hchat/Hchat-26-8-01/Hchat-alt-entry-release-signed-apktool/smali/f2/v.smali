.class public abstract Lf2/v;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lf2/x;

.field public static final b:Lf2/x;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lf2/x;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lf2/k;->y:Lf2/k;

    .line 5
    .line 6
    const-string v3, "TestTagsAsResourceId"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lf2/x;-><init>(Ljava/lang/String;ZLfg/p;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lf2/v;->a:Lf2/x;

    .line 12
    .line 13
    sget-object v0, Lf2/k;->x:Lf2/k;

    .line 14
    .line 15
    new-instance v1, Lf2/x;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    const-string v3, "AccessibilityClassName"

    .line 19
    .line 20
    invoke-direct {v1, v3, v2, v0}, Lf2/x;-><init>(Ljava/lang/String;ZLfg/p;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lf2/v;->b:Lf2/x;

    .line 24
    .line 25
    return-void
.end method
