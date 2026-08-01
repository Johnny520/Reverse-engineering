.class public final Lxhss/ᲀᛱᛸᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛱᛱᛲᲇ:I


# instance fields
.field public ᛷᛵᛵᲈ:Lxhss/ᛸᛱᛱᛳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "JSON_SMART_SIMPLE"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x1fc0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/16 v0, -0x2001

    .line 13
    .line 14
    :goto_0
    sput v0, Lxhss/ᲀᛱᛸᛶ;->ᛱᛱᛲᲇ:I

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
