.class public LYue/ۥ۟ۢۨۦ;
.super LYue/ۥ۟ۦۡۢ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06e6\u06e1\u06e2<",
        "Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;",
        ">;"
    }
.end annotation


# instance fields
.field public ۥ۟۟۟۟:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x398

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LYue/ۥ۟ۦۡۢ;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۢۨۦ;->ۥ۟۟۟۟:Ljava/util/HashMap;

    return-void
.end method

.method public static native synthetic ۥ۟۟۠ۥ(LYue/ۥ۟ۢۨۦ;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;Landroid/widget/CompoundButton;Z)V
.end method


# virtual methods
.method public bridge native synthetic ۥ۟۟۟۠(LYue/ۥ۟ۦۣۡ;Ljava/lang/Object;I)V
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000,
            0x1000
        }
        names = {
            null,
            null,
            null
        }
    .end annotation
.end method

.method public native ۥ۟۟۟ۦ()I
.end method

.method public native ۥ۟۟۠ۦ(LYue/ۥ۟ۦۣۡ;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;I)V
.end method

.method public native ۥ۟۟۠ۧ()Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;",
            ">;"
        }
    .end annotation
.end method

.method public final native synthetic ۥ۟۟۠ۨ(Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;Landroid/widget/CompoundButton;Z)V
.end method
