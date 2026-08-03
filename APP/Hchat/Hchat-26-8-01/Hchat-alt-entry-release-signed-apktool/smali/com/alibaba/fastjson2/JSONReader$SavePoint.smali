.class public Lcom/alibaba/fastjson2/JSONReader$SavePoint;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson2/JSONReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SavePoint"
.end annotation


# instance fields
.field protected final current:I

.field protected final offset:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader$SavePoint;->offset:I

    .line 5
    .line 6
    iput p2, p0, Lcom/alibaba/fastjson2/JSONReader$SavePoint;->current:I

    .line 7
    .line 8
    return-void
.end method
