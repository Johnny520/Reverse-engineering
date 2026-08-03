.class final Lcom/alibaba/fastjson2/JSONPath$Context;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson2/JSONPath;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Context"
.end annotation


# instance fields
.field final current:Lcom/alibaba/fastjson2/JSONPathSegment;

.field eval:Z

.field final next:Lcom/alibaba/fastjson2/JSONPathSegment;

.field final parent:Lcom/alibaba/fastjson2/JSONPath$Context;

.field final path:Lcom/alibaba/fastjson2/JSONPath;

.field final readerFeatures:J

.field root:Ljava/lang/Object;

.field value:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/JSONPath;Lcom/alibaba/fastjson2/JSONPath$Context;Lcom/alibaba/fastjson2/JSONPathSegment;Lcom/alibaba/fastjson2/JSONPathSegment;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONPath$Context;->path:Lcom/alibaba/fastjson2/JSONPath;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/alibaba/fastjson2/JSONPath$Context;->current:Lcom/alibaba/fastjson2/JSONPathSegment;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/alibaba/fastjson2/JSONPath$Context;->next:Lcom/alibaba/fastjson2/JSONPathSegment;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/alibaba/fastjson2/JSONPath$Context;->parent:Lcom/alibaba/fastjson2/JSONPath$Context;

    .line 11
    .line 12
    iput-wide p5, p0, Lcom/alibaba/fastjson2/JSONPath$Context;->readerFeatures:J

    .line 13
    .line 14
    return-void
.end method
