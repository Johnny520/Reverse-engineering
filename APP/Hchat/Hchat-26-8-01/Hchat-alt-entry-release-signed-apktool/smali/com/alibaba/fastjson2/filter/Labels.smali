.class public Lcom/alibaba/fastjson2/filter/Labels;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson2/filter/Labels$DefaultLabelFilter;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static varargs excludes([Ljava/lang/String;)Lcom/alibaba/fastjson2/filter/LabelFilter;
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/filter/Labels$DefaultLabelFilter;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p0}, Lcom/alibaba/fastjson2/filter/Labels$DefaultLabelFilter;-><init>([Ljava/lang/String;[Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static varargs includes([Ljava/lang/String;)Lcom/alibaba/fastjson2/filter/LabelFilter;
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/filter/Labels$DefaultLabelFilter;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/alibaba/fastjson2/filter/Labels$DefaultLabelFilter;-><init>([Ljava/lang/String;[Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
