.class public final Lcom/dokar/quickjs/binding/JsFunction;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field private final isAsync:Z

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
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
    iput-object p1, p0, Lcom/dokar/quickjs/binding/JsFunction;->name:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p2, p0, Lcom/dokar/quickjs/binding/JsFunction;->isAsync:Z

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/dokar/quickjs/binding/JsFunction;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final isAsync()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/dokar/quickjs/binding/JsFunction;->isAsync:Z

    .line 2
    .line 3
    return p0
.end method
