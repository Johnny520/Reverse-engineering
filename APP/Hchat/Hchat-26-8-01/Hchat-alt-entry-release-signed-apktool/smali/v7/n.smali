.class public final Lv7/n;
.super Lv7/k;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final i:[Lv7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lv7/n;

    .line 2
    .line 3
    const-string v1, "navexposed"

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-direct {v0, v1, v2}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lv7/n;

    .line 10
    .line 11
    const-string v2, "navhidden"

    .line 12
    .line 13
    const/16 v3, 0x8

    .line 14
    .line 15
    invoke-direct {v1, v2, v3}, Lv7/k;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    filled-new-array {v0, v1}, [Lv7/n;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lv7/n;->i:[Lv7/n;

    .line 23
    .line 24
    return-void
.end method
