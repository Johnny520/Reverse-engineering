.class public final Lcom/dokar/quickjs/binding/JsProperty;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field private final configurable:Z

.field private final enumerable:Z

.field private final name:Ljava/lang/String;

.field private final writable:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/dokar/quickjs/binding/JsProperty;->name:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p2, p0, Lcom/dokar/quickjs/binding/JsProperty;->configurable:Z

    .line 10
    .line 11
    iput-boolean p3, p0, Lcom/dokar/quickjs/binding/JsProperty;->writable:Z

    .line 12
    .line 13
    iput-boolean p4, p0, Lcom/dokar/quickjs/binding/JsProperty;->enumerable:Z

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final getConfigurable()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/dokar/quickjs/binding/JsProperty;->configurable:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getEnumerable()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/dokar/quickjs/binding/JsProperty;->enumerable:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/dokar/quickjs/binding/JsProperty;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getWritable()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/dokar/quickjs/binding/JsProperty;->writable:Z

    .line 2
    .line 3
    return p0
.end method
