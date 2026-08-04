.class public final synthetic Lyyds/ᛷᲀᲁ;
.super Ljava/lang/Object;

# interfaces
.implements Lyyds/ᛷᛴᲈᲀ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/String;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xcc

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/LinkedHashSet;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛷᲀᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛷᲀᲁ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛷᲀᲁ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final native ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
.end method
