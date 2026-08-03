.class public Lcom/alibaba/fastjson2/filter/BeanContext;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private final beanClass:Ljava/lang/Class;

.field private final features:J

.field private final field:Ljava/lang/reflect/Field;

.field private final fieldClass:Ljava/lang/Class;

.field private final fieldType:Ljava/lang/reflect/Type;

.field private final format:Ljava/lang/String;

.field private final label:Ljava/lang/String;

.field private final method:Ljava/lang/reflect/Method;

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/reflect/Type;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->beanClass:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->method:Ljava/lang/reflect/Method;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->field:Ljava/lang/reflect/Field;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->name:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->label:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->fieldClass:Ljava/lang/Class;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->fieldType:Ljava/lang/reflect/Type;

    .line 17
    .line 18
    iput-wide p8, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->features:J

    .line 19
    .line 20
    iput-object p10, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->format:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->method:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->field:Ljava/lang/reflect/Field;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_1
    return-object v0
.end method

.method public getBeanClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->beanClass:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFeatures()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->features:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getField()Ljava/lang/reflect/Field;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->field:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFieldClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->fieldClass:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFieldType()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->fieldType:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->format:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->label:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMethod()Ljava/lang/reflect/Method;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->method:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public isJsonDirect()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/filter/BeanContext;->features:J

    .line 2
    .line 3
    const-wide/high16 v2, 0x4000000000000L

    .line 4
    .line 5
    and-long/2addr v0, v2

    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method
