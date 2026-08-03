.class public LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۧۨۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e1"
.end annotation


# static fields
.field public static final ۥ:LYue/ۥۢ۟ۡ;
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "sGnssStatusListeners"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06df\u06e1<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥ۟:LYue/ۥۢ۟ۡ;
    .annotation build LYue/ۥ۠ۤ۟ۦ;
        value = "sGnssMeasurementListeners"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06df\u06e1<",
            "Landroid/location/GnssMeasurementsEvent$Callback;",
            "Landroid/location/GnssMeasurementsEvent$Callback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۢ۟ۡ;

    invoke-direct {v0}, LYue/ۥۢ۟ۡ;-><init>()V

    sput-object v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    new-instance v0, LYue/ۥۢ۟ۡ;

    invoke-direct {v0}, LYue/ۥۢ۟ۡ;-><init>()V

    sput-object v0, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۡ;->ۥ۟:LYue/ۥۢ۟ۡ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
