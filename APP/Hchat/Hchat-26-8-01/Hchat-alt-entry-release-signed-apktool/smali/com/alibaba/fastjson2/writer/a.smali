.class public final synthetic Lcom/alibaba/fastjson2/writer/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;

.field public final synthetic c:Lcom/alibaba/fastjson2/codec/FieldInfo;

.field public final synthetic d:Ljava/lang/Class;

.field public final synthetic e:J

.field public final synthetic f:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

.field public final synthetic g:Lcom/alibaba/fastjson2/codec/BeanInfo;

.field public final synthetic h:Ljava/util/TreeMap;


# direct methods
.method public synthetic constructor <init>(Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;Lcom/alibaba/fastjson2/codec/FieldInfo;JLcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/util/TreeMap;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lcom/alibaba/fastjson2/writer/a;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/a;->b:Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/alibaba/fastjson2/writer/a;->c:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 10
    .line 11
    iput-wide p3, p0, Lcom/alibaba/fastjson2/writer/a;->e:J

    .line 12
    .line 13
    iput-object p5, p0, Lcom/alibaba/fastjson2/writer/a;->g:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 14
    .line 15
    iput-object p6, p0, Lcom/alibaba/fastjson2/writer/a;->f:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 16
    .line 17
    iput-object p7, p0, Lcom/alibaba/fastjson2/writer/a;->d:Ljava/lang/Class;

    .line 18
    .line 19
    iput-object p8, p0, Lcom/alibaba/fastjson2/writer/a;->h:Ljava/util/TreeMap;

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/util/TreeMap;I)V
    .locals 0

    .line 22
    iput p9, p0, Lcom/alibaba/fastjson2/writer/a;->a:I

    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/a;->b:Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;

    iput-object p2, p0, Lcom/alibaba/fastjson2/writer/a;->c:Lcom/alibaba/fastjson2/codec/FieldInfo;

    iput-object p3, p0, Lcom/alibaba/fastjson2/writer/a;->d:Ljava/lang/Class;

    iput-wide p4, p0, Lcom/alibaba/fastjson2/writer/a;->e:J

    iput-object p6, p0, Lcom/alibaba/fastjson2/writer/a;->f:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    iput-object p7, p0, Lcom/alibaba/fastjson2/writer/a;->g:Lcom/alibaba/fastjson2/codec/BeanInfo;

    iput-object p8, p0, Lcom/alibaba/fastjson2/writer/a;->h:Ljava/util/TreeMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/writer/a;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v9, v0, Lcom/alibaba/fastjson2/writer/a;->h:Ljava/util/TreeMap;

    .line 9
    .line 10
    move-object/from16 v10, p1

    .line 11
    .line 12
    check-cast v10, Ljava/lang/reflect/Method;

    .line 13
    .line 14
    iget-object v2, v0, Lcom/alibaba/fastjson2/writer/a;->b:Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;

    .line 15
    .line 16
    iget-object v3, v0, Lcom/alibaba/fastjson2/writer/a;->c:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 17
    .line 18
    iget-wide v4, v0, Lcom/alibaba/fastjson2/writer/a;->e:J

    .line 19
    .line 20
    iget-object v6, v0, Lcom/alibaba/fastjson2/writer/a;->g:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 21
    .line 22
    iget-object v7, v0, Lcom/alibaba/fastjson2/writer/a;->f:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 23
    .line 24
    iget-object v8, v0, Lcom/alibaba/fastjson2/writer/a;->d:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-static/range {v2 .. v10}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->b(Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;Lcom/alibaba/fastjson2/codec/FieldInfo;JLcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/util/TreeMap;Ljava/lang/reflect/Method;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/a;->h:Ljava/util/TreeMap;

    .line 31
    .line 32
    move-object/from16 v19, p1

    .line 33
    .line 34
    check-cast v19, Ljava/lang/reflect/Field;

    .line 35
    .line 36
    iget-object v11, v0, Lcom/alibaba/fastjson2/writer/a;->b:Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;

    .line 37
    .line 38
    iget-object v12, v0, Lcom/alibaba/fastjson2/writer/a;->c:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 39
    .line 40
    iget-object v13, v0, Lcom/alibaba/fastjson2/writer/a;->d:Ljava/lang/Class;

    .line 41
    .line 42
    iget-wide v14, v0, Lcom/alibaba/fastjson2/writer/a;->e:J

    .line 43
    .line 44
    iget-object v2, v0, Lcom/alibaba/fastjson2/writer/a;->f:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 45
    .line 46
    iget-object v3, v0, Lcom/alibaba/fastjson2/writer/a;->g:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 47
    .line 48
    move-object/from16 v18, v1

    .line 49
    .line 50
    move-object/from16 v16, v2

    .line 51
    .line 52
    move-object/from16 v17, v3

    .line 53
    .line 54
    invoke-static/range {v11 .. v19}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->c(Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/util/TreeMap;Ljava/lang/reflect/Field;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_1
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/a;->h:Ljava/util/TreeMap;

    .line 59
    .line 60
    move-object/from16 v28, p1

    .line 61
    .line 62
    check-cast v28, Ljava/lang/reflect/Field;

    .line 63
    .line 64
    iget-object v2, v0, Lcom/alibaba/fastjson2/writer/a;->b:Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;

    .line 65
    .line 66
    iget-object v3, v0, Lcom/alibaba/fastjson2/writer/a;->c:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 67
    .line 68
    iget-object v4, v0, Lcom/alibaba/fastjson2/writer/a;->d:Ljava/lang/Class;

    .line 69
    .line 70
    iget-wide v5, v0, Lcom/alibaba/fastjson2/writer/a;->e:J

    .line 71
    .line 72
    iget-object v7, v0, Lcom/alibaba/fastjson2/writer/a;->f:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 73
    .line 74
    iget-object v8, v0, Lcom/alibaba/fastjson2/writer/a;->g:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 75
    .line 76
    move-object/from16 v27, v1

    .line 77
    .line 78
    move-object/from16 v20, v2

    .line 79
    .line 80
    move-object/from16 v21, v3

    .line 81
    .line 82
    move-object/from16 v22, v4

    .line 83
    .line 84
    move-wide/from16 v23, v5

    .line 85
    .line 86
    move-object/from16 v25, v7

    .line 87
    .line 88
    move-object/from16 v26, v8

    .line 89
    .line 90
    invoke-static/range {v20 .. v28}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->a(Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/util/TreeMap;Ljava/lang/reflect/Field;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
