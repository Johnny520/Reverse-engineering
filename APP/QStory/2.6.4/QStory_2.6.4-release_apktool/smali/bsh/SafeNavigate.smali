.class public Lbsh/SafeNavigate;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field private static final abortException:Lbsh/SafeNavigate;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lbsh/SafeNavigate;

    .line 2
    .line 3
    invoke-direct {v0}, Lbsh/SafeNavigate;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbsh/SafeNavigate;->abortException:Lbsh/SafeNavigate;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static doAbort()Lbsh/SafeNavigate;
    .locals 1

    .line 1
    sget-object v0, Lbsh/SafeNavigate;->abortException:Lbsh/SafeNavigate;

    .line 2
    .line 3
    return-object v0
.end method
