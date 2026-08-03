.class public final synthetic Lcom/alibaba/fastjson2/util/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Class;

.field public final synthetic d:C

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:[Ljava/lang/reflect/Field;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Class;CLjava/lang/String;[Ljava/lang/reflect/Field;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/alibaba/fastjson2/util/a;->a:I

    .line 5
    .line 6
    iput p2, p0, Lcom/alibaba/fastjson2/util/a;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/util/a;->c:Ljava/lang/Class;

    .line 9
    .line 10
    iput-char p4, p0, Lcom/alibaba/fastjson2/util/a;->d:C

    .line 11
    .line 12
    iput-object p5, p0, Lcom/alibaba/fastjson2/util/a;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/alibaba/fastjson2/util/a;->f:[Ljava/lang/reflect/Field;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget-object v5, p0, Lcom/alibaba/fastjson2/util/a;->f:[Ljava/lang/reflect/Field;

    .line 2
    .line 3
    move-object v6, p1

    .line 4
    check-cast v6, Ljava/lang/reflect/Field;

    .line 5
    .line 6
    iget v0, p0, Lcom/alibaba/fastjson2/util/a;->a:I

    .line 7
    .line 8
    iget v1, p0, Lcom/alibaba/fastjson2/util/a;->b:I

    .line 9
    .line 10
    iget-object v2, p0, Lcom/alibaba/fastjson2/util/a;->c:Ljava/lang/Class;

    .line 11
    .line 12
    iget-char v3, p0, Lcom/alibaba/fastjson2/util/a;->d:C

    .line 13
    .line 14
    iget-object v4, p0, Lcom/alibaba/fastjson2/util/a;->e:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static/range {v0 .. v6}, Lcom/alibaba/fastjson2/util/BeanUtils;->c(IILjava/lang/Class;CLjava/lang/String;[Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
