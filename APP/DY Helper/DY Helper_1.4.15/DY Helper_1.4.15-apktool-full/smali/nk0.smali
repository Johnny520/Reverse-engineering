.class public final Lnk0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lnk0;

.field public static final β:Ljava/util/Set;

.field public static final γ:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lnk0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lnk0;->α:Lnk0;

    .line 7
    .line 8
    const-string v0, "\u5df2\u8bfb"

    .line 9
    .line 10
    const-string v1, "\u5bf9\u65b9\u5df2\u8bfb"

    .line 11
    .line 12
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lnk0;->β:Ljava/util/Set;

    .line 21
    .line 22
    const-string v9, "msgread"

    .line 23
    .line 24
    const-string v10, "msg_read"

    .line 25
    .line 26
    const-string v1, "readstatus"

    .line 27
    .line 28
    const-string v2, "read_status"

    .line 29
    .line 30
    const-string v3, "readstate"

    .line 31
    .line 32
    const-string v4, "read_state"

    .line 33
    .line 34
    const-string v5, "readreceipt"

    .line 35
    .line 36
    const-string v6, "read_receipt"

    .line 37
    .line 38
    const-string v7, "messageread"

    .line 39
    .line 40
    const-string v8, "message_read"

    .line 41
    .line 42
    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lnk0;->γ:Ljava/util/List;

    .line 51
    .line 52
    return-void
.end method
