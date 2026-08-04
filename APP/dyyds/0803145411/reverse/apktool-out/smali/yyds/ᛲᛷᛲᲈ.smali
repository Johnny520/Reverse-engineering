.class public final Lyyds/ᛲᛷᛲᲈ;
.super Ljava/lang/Object;


# instance fields
.field public final ᛲᲈᲁ:Lorg/json/JSONObject;

.field public final ᛵᛸᛸᛷ:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3e

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛲᛷᛲᲈ;->ᛲᲈᲁ:Lorg/json/JSONObject;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛲᛷᛲᲈ;->ᛵᛸᛸᛷ:Lorg/json/JSONObject;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final native equals(Ljava/lang/Object;)Z
.end method

.method public final native hashCode()I
.end method

.method public final native toString()Ljava/lang/String;
.end method
