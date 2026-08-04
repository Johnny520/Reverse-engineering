.class public final Lyyds/ᛶᛵᲁᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛵᛸᛸᛷ:I


# instance fields
.field public ᛲᲈᲁ:Lyyds/ᲀᲀᛸᛳ;


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
    sput v0, Lyyds/ᛶᛵᲁᛳ;->ᛵᛸᛸᛷ:I

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
