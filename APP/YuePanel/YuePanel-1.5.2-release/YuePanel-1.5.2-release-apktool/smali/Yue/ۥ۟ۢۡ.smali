.class public LYue/ۥ۟ۢۡ;
.super Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۢۡ$ۥ۟;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06df\u06e1<",
        "LYue/\u06e5\u06df\u06e2\u06e1$\u06e5\u06df;",
        ">;"
    }
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۟ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۦ:Ljava/lang/String;


# instance fields
.field public final ۥ:Landroid/content/Context;

.field public final ۥ۟:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yuexin/panel/panel/voice/audiobuild/AudioRecord;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟:Ljava/lang/String;

.field public ۥ۟۟۟:Z

.field public ۥ۟۟۟۟:I

.field public final ۥ۟۟۟۠:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/yuexin/panel/panel/voice/audiobuild/AudioRecord;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟ۡ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1b5

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/panel/voice/audiobuild/AudioRecord;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥ۟ۢۡ;->ۥ۟۟۟:Z

    const/4 v0, 0x1

    iput v0, p0, LYue/ۥ۟ۢۡ;->ۥ۟۟۟۟:I

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۢۡ;->ۥ۟۟۟۠:Ljava/util/HashMap;

    iput-object p1, p0, LYue/ۥ۟ۢۡ;->ۥ:Landroid/content/Context;

    iput-object p2, p0, LYue/ۥ۟ۢۡ;->ۥ۟:Ljava/util/List;

    iput-object p3, p0, LYue/ۥ۟ۢۡ;->ۥ۟۟:Ljava/lang/String;

    iput-object p4, p0, LYue/ۥ۟ۢۡ;->ۥ۟۟۟ۡ:Ljava/lang/String;

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ۟(Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V
.end method

.method public static native synthetic ۥ۟۟(Ljava/lang/String;LYue/ۥ۟ۢۡ$ۥ۟;Landroid/view/View;)V
.end method

.method public static native synthetic ۥ۟۟۟(LYue/ۥ۟ۢۡ;Landroid/view/View;ILcom/yuexin/panel/panel/voice/audiobuild/AudioRecord;Landroid/view/View;)V
.end method

.method public static native synthetic ۥ۟۟۟۟(Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V
.end method

.method public static native synthetic ۥ۟۟۟۠(LYue/ۥ۟ۢۡ;)Ljava/util/List;
.end method

.method public static native synthetic ۥ۟۟۟ۡ(LYue/ۥ۟ۢۡ;Z)Z
.end method

.method public static native synthetic ۥ۟۟۟ۤ(Ljava/lang/String;LYue/ۥ۟ۢۡ$ۥ۟;Landroid/view/View;)V
.end method

.method public static native synthetic ۥ۟۟۟ۥ(Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V
.end method

.method public static native synthetic ۥ۟۟۟ۦ(Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)V
.end method


# virtual methods
.method public native getItemCount()I
.end method

.method public bridge native synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;I)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1010
        }
        names = {
            null,
            null
        }
    .end annotation
.end method

.method public bridge native synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation
.end method

.method public final native ۥ۟۟۟ۢ(Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Ljava/lang/String;I)V
.end method

.method public native ۥۣ۟۟۟()V
.end method

.method public final native synthetic ۥ۟۟۟ۧ(Landroid/view/View;ILcom/yuexin/panel/panel/voice/audiobuild/AudioRecord;Landroid/view/View;)V
.end method

.method public native ۥ۟۟۟ۨ(LYue/ۥ۟ۢۡ$ۥ۟;I)V
.end method

.method public native ۥ۟۟۠(Landroid/view/ViewGroup;I)LYue/ۥ۟ۢۡ$ۥ۟;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end method

.method public final native ۥ۟۟۠۟(I)V
.end method

.method public native ۥ۟۟۠۠(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yuexin/panel/panel/voice/audiobuild/AudioRecord;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation
.end method
