.class public final Lg6/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lg6/a;

.field public static b:Lg6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lg6/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg6/a;->a:Lg6/a;

    .line 7
    .line 8
    return-void
.end method

.method public static a()Lg6/a;
    .locals 1

    .line 1
    sget-object v0, Lg6/a;->b:Lg6/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lg6/a;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lg6/a;->b:Lg6/a;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lg6/a;->b:Lg6/a;

    .line 13
    .line 14
    return-object v0
.end method
