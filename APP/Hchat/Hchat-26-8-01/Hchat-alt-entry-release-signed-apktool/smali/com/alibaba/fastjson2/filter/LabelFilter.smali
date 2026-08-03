.class public interface abstract Lcom/alibaba/fastjson2/filter/LabelFilter;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/filter/Filter;


# direct methods
.method public static compose(Lcom/alibaba/fastjson2/filter/LabelFilter;Lcom/alibaba/fastjson2/filter/LabelFilter;)Lcom/alibaba/fastjson2/filter/LabelFilter;
    .locals 3

    .line 1
    instance-of v0, p0, Lcom/alibaba/fastjson2/filter/CompositeLabelFilter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lcom/alibaba/fastjson2/filter/CompositeLabelFilter;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/filter/CompositeLabelFilter;->add(Lcom/alibaba/fastjson2/filter/LabelFilter;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/filter/CompositeLabelFilter;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    new-array v1, v1, [Lcom/alibaba/fastjson2/filter/LabelFilter;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    aput-object p0, v1, v2

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    aput-object p1, v1, p0

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/filter/CompositeLabelFilter;-><init>([Lcom/alibaba/fastjson2/filter/LabelFilter;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method


# virtual methods
.method public abstract apply(Ljava/lang/String;)Z
.end method
