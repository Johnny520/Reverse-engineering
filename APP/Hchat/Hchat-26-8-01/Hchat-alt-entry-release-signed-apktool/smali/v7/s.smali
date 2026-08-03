.class public final Lv7/s;
.super Lv7/k;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final i:[Lv7/s;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lv7/s;

    .line 2
    .line 3
    const-string v1, "notlong"

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lv7/s;

    .line 11
    .line 12
    const-string v2, "long"

    .line 13
    .line 14
    const/16 v3, 0x20

    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    filled-new-array {v0, v1}, [Lv7/s;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lv7/s;->i:[Lv7/s;

    .line 24
    .line 25
    return-void
.end method
