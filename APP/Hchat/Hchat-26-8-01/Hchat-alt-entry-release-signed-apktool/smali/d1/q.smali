.class public final Ld1/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Le1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le1/c;

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    invoke-direct {v0, v1, v1, v1, v1}, Le1/c;-><init>(FFFF)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ld1/q;->a:Le1/c;

    .line 9
    .line 10
    return-void
.end method
